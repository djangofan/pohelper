package com.selgentests.utils;


public class TestException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public TestException( String errorMessage ) {
		super("TEST FAILURE -- " + errorMessage);	
	}

}
