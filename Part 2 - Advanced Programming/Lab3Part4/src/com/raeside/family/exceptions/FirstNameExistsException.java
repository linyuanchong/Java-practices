package com.raeside.family.exceptions;

//FirstNameExistsException declaration.
public class FirstNameExistsException extends Exception {
	
	private static final long serialVersionUID=123456;
	
	public FirstNameExistsException(String message) {
		super(message);
	}
	
}
