package com.java.execeptionhandling.intro;

public class ExceptionHandlingA {
	public static void main(String[] args) {
		System.out.println("This statement will be executed");

		Integer I = new Integer("abc"); // This statement throws NumberFormatException

		System.out.println("This statement will not be executed");
	}
}