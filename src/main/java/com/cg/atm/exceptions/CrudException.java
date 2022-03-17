package com.cg.atm.exceptions;

@SuppressWarnings("serial")
public class CrudException extends RuntimeException {
	
	public CrudException(String message) {
		super(message);
	}

}
