package org.cidarlab.minieugene.predicates.positioning.after;

import org.cidarlab.minieugene.constants.RuleOperator;
import org.cidarlab.minieugene.dom.Component;
import org.cidarlab.minieugene.exception.EugeneException;
import org.cidarlab.minieugene.predicates.BinaryPredicate;
import org.cidarlab.minieugene.predicates.positional.PositioningPredicate;
import org.cidarlab.minieugene.predicates.positioning.before.SomeBefore;

import JaCoP.constraints.Constraint;
import JaCoP.core.IntVar;
import JaCoP.core.Store;



/**
 * 
 * @author Ernst Oberortner
 *
 */
public class SomeAfter 
		extends BinaryPredicate 
		implements PositioningPredicate {

	private SomeBefore before;
	
	public SomeAfter(Component a, Component b) {
		super(a, b);
		this.before = new SomeBefore(b, a);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getA())
				.append(" ").append(RuleOperator.SOME_AFTER).append(" ")
				.append(this.getB());

		return sb.toString();
	}
	
	@Override
	public String getOperator() {
		return RuleOperator.SOME_AFTER.toString();
	}

	@Override
	public Constraint toJaCoP(Store store, IntVar[][] variables) 
			throws EugeneException {
		return this.before.toJaCoP(store, variables);
	}

	@Override
	public Constraint toJaCoPNot(Store store, IntVar[][] variables)
			throws EugeneException {
		return this.before.toJaCoPNot(store, variables);
	}
}

