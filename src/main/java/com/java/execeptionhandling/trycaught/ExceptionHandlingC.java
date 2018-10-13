package com.java.execeptionhandling.trycaught;

public class ExceptionHandlingC {
	public static void main(String[] args) {
		try {
			String s = null;
			System.out.println(s.length());
		} catch (Exception ex) {
			System.out.println(ex);
			ex.printStackTrace();
		}
	}
}
