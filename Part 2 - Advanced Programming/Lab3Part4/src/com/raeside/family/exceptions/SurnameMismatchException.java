package com.raeside.family.exceptions;

//SurnameMismatchException declaration.
public class SurnameMismatchException extends Exception{
	
	private static final long serialVersionUID=123457;
	
	public SurnameMismatchException(String message) {
		super(message);
	}
}
