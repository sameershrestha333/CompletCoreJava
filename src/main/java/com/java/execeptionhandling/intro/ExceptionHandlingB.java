package com.java.execeptionhandling.intro;

public class ExceptionHandlingB {
	public static void main(String[] args) {
		System.out.println("This statement will be executed");
		try {
			Integer I = new Integer("abc"); // This statement throws NumberFormatException

		} catch (Exception e) {
			System.out.println("Exception caught");
		}

		System.out.println("This statement will not be executed");
	}
}