package com.java.polymorphism.methodOverloading;

public class MethodOverloading {
	private static void methodOverloaded() {
		// No argument, private static method
	}

	private int methodOverloaded(int i) {
		// One argument private non-static method
		return i;
	}

	static int methodOverloaded(double d) {
		// static Method
		return 0;
	}

	public void methodOverloaded(int i, double d) {
		// Public non-static Method
	}
}