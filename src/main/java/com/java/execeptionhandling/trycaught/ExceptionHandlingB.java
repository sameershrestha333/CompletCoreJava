package com.java.execeptionhandling.trycaught;

public class ExceptionHandlingB {
	public static void main(String[] args) {
		try {
			int i = 10 / 0;
			System.out.println("This statement will not be executed");
		} catch (Exception e) {
			System.out.println("This block is executed immediately after an exception is thrown");
		}
	}
}
