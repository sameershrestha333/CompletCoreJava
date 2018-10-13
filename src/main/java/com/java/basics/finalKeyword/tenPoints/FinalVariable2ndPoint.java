package com.java.basics.finalKeyword.tenPoints;

class FinalVariable2ndPoint {
	final int i = 10;

	void methodOne() {
		//i++;
		// above statement gives Compile time error.
		// value of final variable can not be changed

		int j = i; // final variable can be used to initialize other variables.

		System.out.println(i); // final variable can be used
	}
}