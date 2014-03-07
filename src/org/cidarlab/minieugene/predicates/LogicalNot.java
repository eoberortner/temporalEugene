package org.cidarlab.minieugene.predicates;

import org.cidarlab.minieugene.exception.EugeneException;

import JaCoP.constraints.Constraint;
import JaCoP.core.IntVar;
import JaCoP.core.Store;


public class LogicalNot 
	extends LogicalPredicate {

	private Predicate predicate;
	
	/**
	 * 
	 * @param predicate
	 */
	public LogicalNot(Predicate predicate) {
		super(LogicalOperator.NOT, predicate);
	}
	
	/**
	 * 
	 * @return
	 */
	public Predicate getPredicate() {
		return this.predicate;
	}
	
	@Override 
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("NOT ").append(this.getPredicate()).append("");
		return sb.toString();
	}

	@Override
	public Constraint toJaCoP(Store store, IntVar[][] variables)
			throws EugeneException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Constraint toJaCoPNot(Store store, IntVar[][] variables)
			throws EugeneException {
		// TODO Auto-generated method stub
		return null;
	}
	
}
