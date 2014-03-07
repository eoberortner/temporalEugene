package org.cidarlab.minieugene.solver.jacop;

import java.util.ArrayList;
import java.util.List;

import org.cidarlab.minieugene.dom.Component;
import org.cidarlab.minieugene.exception.EugeneException;
import org.cidarlab.minieugene.predicates.Predicate;
import org.cidarlab.minieugene.predicates.counting.CountingPredicate;
import org.cidarlab.minieugene.predicates.interaction.Induces;
import org.cidarlab.minieugene.predicates.interaction.InteractionPredicate;
import org.cidarlab.minieugene.predicates.interaction.Represses;
import org.cidarlab.minieugene.predicates.pairing.PairingPredicate;
import org.cidarlab.minieugene.solver.Solver;
import org.cidarlab.minieugene.symbol.SymbolTables;

import JaCoP.constraints.Alldifferent;
import JaCoP.constraints.Constraint;
import JaCoP.constraints.And;
import JaCoP.constraints.IfThen;
import JaCoP.constraints.Or;
import JaCoP.constraints.PrimitiveConstraint;
import JaCoP.constraints.XeqC;
import JaCoP.core.Domain;
import JaCoP.core.IntVar;
import JaCoP.core.Store;
import JaCoP.core.ValueEnumeration;
import JaCoP.search.DepthFirstSearch;
import JaCoP.search.IndomainSimpleRandom;
import JaCoP.search.MostConstrainedDynamic;
import JaCoP.search.Search;
import JaCoP.search.SelectChoicePoint;
import JaCoP.search.SimpleMatrixSelect;
import JaCoP.search.SimpleSelect;


public class JaCoPSolver 
		implements Solver {

	private Store store;
	private SymbolTables symbols;
	private int N;
	
	public JaCoPSolver(SymbolTables symbols) {
		this.store = new Store();
		this.symbols = symbols;
	}
	
	public List<Component[]> solve(int N, Component[] symbols, Predicate[] predicates, int NR_OF_SOLUTIONS)
			throws EugeneException {

		this.N = N;
		// If the user does not provide an N,
		if(N == -1) {  
			// then we calculate the minimum N
			calculateMinN(predicates);
		}
		System.out.println(N);
		
		
    	/*
    	 * create the variables of the constraint solving problem
    	 * i.e. the parts
    	 */
    	IntVar[][] variables = this.model(symbols);

    	/*
    	 * map the Eugene rules onto JaCoP constraints
    	 */
    	if(null != predicates) {
    		this.imposeConstraints(variables, predicates);
    	}
    	
    	/*
    	 * for testing: print the store's information
    	 */
//    	store.print();
    	
    	/*
    	 * now, let's solve the problem
    	 */
    	Domain[][] solutions = this.search(variables, NR_OF_SOLUTIONS);
    	
    	/*
    	 * finally, we process and return the solutions
    	 */
    	if(null != solutions) {
    		try {
    			return this.processSolutions(solutions);
    		} catch(java.lang.OutOfMemoryError e) {
    			throw new EugeneException("I'm sorry! This problem is currently too big for me to solve!");
    			
    		}
    	} 
    	return null;
	}
    
	private IntVar[][] model(Component[] components) 
			throws EugeneException {
		
		return null;
	}

	public void imposeConstraints(IntVar[][] variables, Predicate[] predicates) 
			throws EugeneException {
		/*
		 * per default, all parts have a FORWARD orientation
		 */
		for(int i=0; i<predicates.length; i++) {
			try {
				if(predicates[i] instanceof Represses || predicates[i] instanceof Induces) {
					this.symbols.putInteraction((InteractionPredicate)predicates[i]);
				} else {
					Constraint constraint = predicates[i].toJaCoP(this.store, variables);
					if(constraint != null) {
						if(constraint instanceof And) {
							for(PrimitiveConstraint pc : ((And)constraint).listOfC) {
								//store.imposeWithConsistency(pc);
								store.impose(pc);
							}
						} else {
							store.impose(constraint);
						}
					}
				}
			} catch(Exception e) {
				e.printStackTrace();
				throw new EugeneException("I cannot impose "+predicates[i]);
			}
		}
	}
	
    private Domain[][] search(IntVar[][] variables, int NR_OF_SOLUTIONS) 
    		throws EugeneException {
    	Search<IntVar> search = new DepthFirstSearch<IntVar>(); 

        SelectChoicePoint<IntVar> select = new SimpleMatrixSelect<IntVar>(
				variables, 
				new MostConstrainedDynamic<IntVar>(), 
				new IndomainSimpleRandom<IntVar>());  

        if(NR_OF_SOLUTIONS != (-1)) {
        	search.getSolutionListener().setSolutionLimit(NR_OF_SOLUTIONS);
        } else {
            search.getSolutionListener().searchAll(true);   
        }
  

        search.setPrintInfo(false);
        search.getSolutionListener().recordSolutions(true);
                
		try {
			/*
			 * search the solutions
			 */
			search.labeling(store, select);
		} catch(OutOfMemoryError oome) {
			throw new EugeneException("I'm sorry! This problem is currently too big for me to solve!");
		} catch(Exception e) {
			e.printStackTrace();
		}

		/*
		 * return the solutions
		 */
		return search.getSolutionListener().getSolutions();
    }

		
	public List<Component[]> processSolutions(Domain[][] solutions) {
		
		List<Component[]> lst = new ArrayList<Component[]>();
		for(int i=0; i<solutions.length && solutions[i]!=null; i++) {
			
			Domain[] solution = solutions[i];
			
			Component[] sol = new Component[this.N];

			for(int j=0; j<this.N; j++) {
				Component symbol = null;
				
				/*
				 * PART
				 */
				ValueEnumeration ve = solution[j].valueEnumeration();
				while(ve.hasMoreElements()) {
					Component old = this.symbols.get(ve.nextElement());
					symbol = new Component(old.getName());
				}
				
				/*
				 * ORIENTATION
				 */
				ve = solution[j+(Variables.ORIENTATION * N)].valueEnumeration();
				while(ve.hasMoreElements()) {
					if(ve.nextElement() == (-1)) {
						symbol.setForward(false);
					}
				}				

				sol[j] = symbol;
			}
			
			lst.add(sol);
		}
		return lst;
	}
    
	
	private int calculateMinN(Predicate[] predicates) {
		int minN = 1;
		for(int i=0; i<predicates.length; i++) {
			if(predicates[i] instanceof CountingPredicate) {
				
			} else if(predicates[i] instanceof PairingPredicate) {
				
			}
		}
		return minN;
	}
}
