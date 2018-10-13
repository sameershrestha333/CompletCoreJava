package com.java.basics.finalKeyword;

class FinalVariable {
	final int i = 10;

	void methodOne() {
		i = 20; // compile time error
		// final field can not be re-assigned
	}
}