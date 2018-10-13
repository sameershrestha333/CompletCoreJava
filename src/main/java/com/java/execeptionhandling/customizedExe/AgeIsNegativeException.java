package com.java.execeptionhandling.customizedExe;

// Defining our owin exception by extending Exception class
public class AgeIsNegativeException extends Exception {
	String errorMessage;

	public AgeIsNegativeException(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	// Modifying toString() to display customized error message
	
	@Override
	public String toString() {
		return errorMessage;
	}
}
