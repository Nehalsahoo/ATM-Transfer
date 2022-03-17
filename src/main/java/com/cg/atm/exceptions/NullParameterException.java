package com.cg.atm.exceptions;

@SuppressWarnings("serial")
public class NullParameterException extends RuntimeException{

	public NullParameterException(String message) {
		super(message);
	}

}