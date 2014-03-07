/*
Copyright (c) 2014 Boston University.
All rights reserved.
Permission is hereby granted, without written agreement and without
license or royalty fees, to use, copy, modify, and distribute this
software and its documentation for any purpose, provided that the above
copyright notice and the following two paragraphs appear in all copies
of this software.

IN NO EVENT SHALL BOSTON UNIVERSITY BE LIABLE TO ANY PARTY
FOR DIRECT, INDIRECT, SPECIAL, INCIDENTAL, OR CONSEQUENTIAL DAMAGES
ARISING OUT OF THE USE OF THIS SOFTWARE AND ITS DOCUMENTATION, EVEN IF
BOSTON UNIVERSITY HAS BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

BOSTON UNIVERSITY SPECIFICALLY DISCLAIMS ANY WARRANTIES,
INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE. THE SOFTWARE
PROVIDED HEREUNDER IS ON AN "AS IS" BASIS, AND BOSTON UNIVERSITY HAS
NO OBLIGATION TO PROVIDE MAINTENANCE, SUPPORT, UPDATES,
ENHANCEMENTS, OR MODIFICATIONS.
 */

package org.cidarlab.minieugene;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.apache.commons.lang3.ArrayUtils;
import org.cidarlab.minieugene.builder.PredicateBuilder;
import org.cidarlab.minieugene.constants.EugeneConstants;
import org.cidarlab.minieugene.constants.EugeneRules;
import org.cidarlab.minieugene.constants.RuleOperator;
import org.cidarlab.minieugene.dom.Component;
import org.cidarlab.minieugene.exception.EugeneException;
import org.cidarlab.minieugene.interaction.Interaction;
import org.cidarlab.minieugene.parser.MiniEugeneLexer;
import org.cidarlab.minieugene.parser.MiniEugeneParser;
import org.cidarlab.minieugene.predicates.LogicalNot;
import org.cidarlab.minieugene.predicates.LogicalOperator;
import org.cidarlab.minieugene.predicates.Predicate;
import org.cidarlab.minieugene.predicates.orientation.AllForward;
import org.cidarlab.minieugene.predicates.orientation.AllReverse;
import org.cidarlab.minieugene.solver.jacop.JaCoPSolver;
import org.cidarlab.minieugene.symbol.SymbolTables;

/**
 * The MiniEugene main class for the utilization of miniEugene as an embedded jar.
 * 
 * @author Ernst Oberortner
 */
public class MiniEugene 
		implements IMiniEugene {
	
	/*
	 * reference to the symbol tables
	 */
	private SymbolTables symbols;
	private PredicateBuilder pb;
	
	private int N;
	
	private MiniEugeneStatistics stats;		
	private List<Component[]> solutions;
	
	/** 
	 * non-args constructor
	 */
	public MiniEugene() {
		this.symbols = new SymbolTables();
		this.pb = new PredicateBuilder(this.symbols);
		
		this.stats = new MiniEugeneStatistics();
		this.solutions = null;
	}
	

	/*
	 * N = ( <number> | '*' )
	 */
	private int parseN(String line) 
			throws EugeneException {

		String[] s = line.split("=");
		if(s.length != 2 || !("N".equalsIgnoreCase(s[0].trim()))) {
			throw new EugeneException("invalid N");
		}
		
		if(!"*".equalsIgnoreCase(s[1].trim())) {
			try {
				return Integer.valueOf(s[1].trim());			
			} catch(NumberFormatException nfe) {
				throw new EugeneException("invalid N");
			}
		}
		
		return -1;
	}

	
//	/*
//	 * PARSING - RELATED METHODS
//	 */
//	private Predicate[] parsePredicates(String[] lines) 
//			throws EugeneException {
//		/*
//		 * the first line needs to be the N line
//		 */
//		Predicate[] predicates = null;
//		int i=0;
//		try {
//			
//			/*
//			 * if there was no N provided, then N
//			 * MUST be specified in the first line
//			 */
//			if(this.N == -1) {
//				this.N = parseN(lines[i++]);
//			}
//			
//			for(; i<lines.length; i++) {
//				lines[i] = lines[i].trim();
//
//				if (! (lines[i].startsWith("//") || lines[i].isEmpty())) {
//					Predicate p = interpreteRule(parseRule(lines[i]));
//					predicates = addPredicate(predicates, p);
//				}
//			}
//			
//		} catch(Exception e) {
//			throw new EugeneException("line "+(i+1)+" => "+e.getMessage());
//		}
//
//		return predicates;
//	}
//	
//	private Predicate[] addPredicate(Predicate[] predicates, Predicate predicate) {
//		if(predicates == null) {
//			predicates = new Predicate[1];
//			predicates[0] = predicate;
//		} else {
//			predicates = ArrayUtils.add(predicates, predicate);
//		}
//		
//		return predicates;
//	}
//	
//	/*
//	 * (NOT)? <symbol> <predicate> <symbol>
//	 * 
//	 * <symbol>    := {p, r, g, t}
//	 * <predicate> := {CONTAINS, NOTCONTAINS}
//	 */
//	private String[] parseRule(String line) 
//			throws EugeneException {
//		String[] s = line.split(" ");
//
//		String[] tokens = null;
//		
//		for(int i=0; i<s.length; i++) {
//
//			// remove possible white spaces
//			s[i].trim();
//			
//			if(s[i] != null && !(s[i].isEmpty())) {
//				
//				if(null == tokens) {
//					tokens = new String[1];
//					tokens[0] = s[i];
//				} else {
//					tokens = ArrayUtils.add(tokens, s[i]);
//				}
//			}
//		}
//		
//		if(null == tokens) {
//			throw new EugeneException("Invalid Rule! "+line);
//		}
//		
//		return tokens;
//	}


	/**
	 * solve/3 method finds NR_OF_SOLUTIONS rule-compliant designs of size N. 
	 * 
	 * NR_OF_SOLUTIONS is a non-negative integer. 
	 *
	 * @param  rules                an array of Strings each representing one miniEugene rule
	 * @param  N                    the size of the design ( >0 )
	 * @param  NR_OF_SOLUTIONS      the number of desired solutions ( >0 )
	 */	
	@Override
	public void solve(String[] rules, int N, int NR_OF_SOLUTIONS) 
			throws EugeneException {

		/*
		 * Error handling
		 */
		if(null == rules) {
			throw new EugeneException("No rules provided!");
		}
		
		if(N < 1) {
			throw new EugeneException("Invalid size of design!");
		}
		this.N = N;
		

		if(NR_OF_SOLUTIONS < -1) {
			throw new EugeneException("Invalid number of required solutions!");
		}

		/*
		 * at the beginning of every run, we clear the symbol tables 
		 * that might contain symbols from earlier runs
		 */
		this.symbols.clear();

		/*
		 * convert the string array of rules to a 
		 * miniEugene program 
		 */
		String script = convert(N, rules);
		System.out.println(script);

		/*
		 * then, we do the lexical analysis and parsing  
		 */
		
//		/*
//		 * solving the problem
//		 */
//		Component[] symbols = this.symbols.getSymbols();
//
//		//System.out.println(symbols);
//		if(null == symbols || symbols.length==0) {
//			throw new EugeneException("no solutions found!");
//		}
//		
//		this.stats.add(EugeneConstants.SIZE_OF_DESIGN, this.N);
//		this.stats.add(EugeneConstants.NUMBER_OF_PARTS, symbols.length);
//		this.stats.add(EugeneConstants.POSSIBLE_SOLUTIONS, Math.pow(symbols.length, N) * Math.pow(2, N));
//		this.stats.add(EugeneConstants.NUMBER_OF_RULES, rules.length);
//				
//		try {
//			
//			long T1 = System.nanoTime();
//			
//			this.solutions = new JaCoPSolver(this.symbols).solve(N, symbols, predicates, NR_OF_SOLUTIONS);
//		
//			long T2 = System.nanoTime();
//			
//			if(null == this.solutions || this.solutions.isEmpty()) {
//				throw new EugeneException("no solutions found!");
//			}
//
//			this.stats.add(EugeneConstants.SOLUTION_FINDING_TIME, (T2-T1)*Math.pow(10, -9));
//			
//		} catch(Exception e) {
//			throw new EugeneException(e.getMessage());
//		}
//
//		if(null != solutions) {
//			this.stats.add(EugeneConstants.NUMBER_OF_SOLUTIONS, solutions.size());
//		} else {
//			this.stats.add(EugeneConstants.NUMBER_OF_SOLUTIONS, 0);
//		}
	}
	
	private String convert(int N, String[] rules) {
		StringBuilder sb = new StringBuilder();
		if(N!=-1) {
			sb.append("N=").append(N).append(".");
		}
		for(int i=0; i<rules.length; i++) {
			sb.append(rules[i]).append(".");
		}
		return sb.toString();
	}

	/**
	 * solve/3 method finds ALL rule-compliant designs of size N. 
	 *
	 * @param  rules  an String array of miniEugene rules
	 * @param  N      the size of the design
	 */	
	@Override
	public void solve(String[] rules, int N) 
			throws EugeneException {
		
		/*
		 * we look for ALL solutions...
		 * hence, we set N to -1 
		 */
		this.solve(rules, N, -1);
	}

	/**
	 * getStatistics/0 method returns statistics
	 * about the last execution of the solve method.
	 * 
	 * if the solve method hasn't been executed, then
	 * getStatistics/0 return NULL
	 * 
	 * @return an instance of the MiniEugeneStatistics class containing
	 *         key-value pairs representing the statistics of the last
	 *         execution of the solve method        
	 */	
	@Override
	public MiniEugeneStatistics getStatistics() {
		return this.stats;
	}

	/**
	 * getSolutions/0 returns the list of solutions found by
	 * the last execution of the solve method.
	 * 
	 * The list contains of arrays of Symbol objects that contain 
	 * information on each solution's symbols:
	 * - an integer ID (generated by miniEugene)
	 * - the name of the symbol (specified by the user as rule operands)
	 * - the orientation (forward/reverse)
	 *
	 * @return a List of Symbol arrays.        
	 */	
	@Override
	public List<Component[]> getSolutions() {
		return this.solutions;
	}
	
	@Override
	public Set<Interaction> getInteractions() {
		return this.symbols.getInteractions();
	}
	
	/**
	 * 
	 * @param script
	 * @param NR_OF_SOLUTIONS
	 * @throws EugeneException
	 */
	protected void executeScript(String script, int NR_OF_SOLUTIONS) 
			throws EugeneException {

		if(null == script || script.isEmpty()) {
			throw new EugeneException("please provide some input!");
		}

		/*
		 * at the beginning of every run, we clear the symbol tables 
		 * that might contain symbols from earlier runs
		 */
		this.symbols.clear();

		MiniEugeneLexer lexer = new MiniEugeneLexer(
				new ANTLRStringStream(script));
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		MiniEugeneParser parser = 
				new MiniEugeneParser(tokens);

		try {
			parser.miniEugene();
		} catch(Exception e) {
			e.printStackTrace();
		}

		
		this.stats = new MiniEugeneStatistics();		
		this.solutions = null;
		
		/*
		 * 
		 */

//		if(sentences.length>0) {
//
//			/*
//			 * parsing
//			 */
//			Predicate[] predicates = this.parsePredicates(sentences);
//
//
//			/*
//			 * solving
//			 */
//			try {
//				Component[] symbols = this.symbols.getSymbols();
//
//				if(null == symbols || symbols.length==0) {
//					throw new EugeneException("no solutions found!");
//				}
//
//				this.stats.add("Number of Parts", symbols.length);
//				this.stats.add("Possible Solutions", Math.pow(symbols.length, this.N) * Math.pow(2, this.N));
//				this.stats.add("Number of Rules", predicates.length);
//
//				/*
//				 * SOLUTION FINDING
//				 */
//				long T1 = System.nanoTime();
//				this.solutions = new JaCoPSolver(this.symbols).solve(this.N, symbols, predicates, NR_OF_SOLUTIONS);
//				long T2 = System.nanoTime();
//
//				if(null != solutions) {
//					this.stats.add(EugeneConstants.NUMBER_OF_SOLUTIONS, solutions.size());
//				} else {
//					this.stats.add(EugeneConstants.NUMBER_OF_SOLUTIONS, 0);
//				}					
//					
//
//				/*
//				 * next, we iterate over the predicates and check if there are any
//				 * SOME_REVERSE directionality predicates
//				 */
//				stats.add(EugeneConstants.SOLUTION_FINDING_TIME, (T2-T1)*Math.pow(10, -9));
//
//				if(null == solutions || solutions.size()==0) {
//					throw new EugeneException("no solutions found!");
//				}
//
//			} catch(Exception e) {
//				e.printStackTrace();
//				throw new EugeneException(e.getMessage());
//			}
//
//		}		
	}

}
