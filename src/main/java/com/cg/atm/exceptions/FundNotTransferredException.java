package com.cg.atm.exceptions;

@SuppressWarnings("serial")
public class FundNotTransferredException extends RuntimeException {

	public FundNotTransferredException() {}
	
	
	public FundNotTransferredException(String errorMessage) {
		super(errorMessage);
	}

	public FundNotTransferredException(Throwable cause) {
		super(cause);
	}

	public FundNotTransferredException(String errorMessage, Throwable cause) {
		super(errorMessage, cause);
	}


}
