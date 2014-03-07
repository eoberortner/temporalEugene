package org.cidarlab.minieugene.predicates.positioning.before;

import org.cidarlab.minieugene.constants.RuleOperator;
import org.cidarlab.minieugene.dom.Component;
import org.cidarlab.minieugene.exception.EugeneException;
import org.cidarlab.minieugene.predicates.BinaryPredicate;
import org.cidarlab.minieugene.predicates.positional.PositioningPredicate;
import org.cidarlab.minieugene.solver.jacop.Variables;

import JaCoP.constraints.And;
import JaCoP.constraints.Constraint;
import JaCoP.constraints.IfThen;
import JaCoP.constraints.PrimitiveConstraint;
import JaCoP.constraints.XeqC;
import JaCoP.constraints.XneqC;
import JaCoP.core.IntVar;
import JaCoP.core.Store;


/**
 * 
 * @author Ernst Oberortner
 *
 */
public class AllBefore 
		extends BinaryPredicate 
		implements PositioningPredicate {

	public AllBefore(Component a, Component b) {
		super(a, b);
	}

	@Override
	public String getOperator() {
		return RuleOperator.ALL_BEFORE.toString();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		try {
			sb.append(this.getA())
				.append(" ").append(RuleOperator.ALL_BEFORE).append(" ")
				.append(this.getB());
		} catch(Exception e) {
			// do nothing...
		}
		return sb.toString();
	}

	@Override
	public Constraint toJaCoP(Store store, IntVar[][] variables) 
				throws EugeneException {

		int a = (int)this.getA().getId();
		int b = (int)this.getB().getId();

		int N = variables[Variables.PART].length;

		/*
		 * a ALL_BEFORE b
		 * 
		 * contains(a) /\ contains (b) => 
		 * 		for all a, b: position(a) < position(b)
		 * otherwise => TRUE
		 */

		// a is FORWARD oriented
		PrimitiveConstraint pc[] = new PrimitiveConstraint[N-1];
		for(int i=1; i<N; i++) {
			if(i > 0) {
				PrimitiveConstraint[] pcB = new PrimitiveConstraint[i];
				for(int j=0; j<i; j++) {
					pcB[j] = new XneqC(variables[Variables.PART][j], b);
				}
				
				pc[i-1] = new IfThen(
							new XeqC(variables[Variables.PART][i], a),
							new And(pcB));
			} else {

				pc[i] = new IfThen(
							new XeqC(variables[Variables.PART][i], a),
							new XneqC(variables[Variables.PART][i], b));
			}							
		}			

		return new And(pc);
	}

	@Override
	public Constraint toJaCoPNot(Store store, IntVar[][] variables)
			throws EugeneException {
		// TODO Auto-generated method stub
		return null;
	}
	
}
