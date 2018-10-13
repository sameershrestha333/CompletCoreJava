package com.java.basics.finalKeyword;

class FinalMethod {

	final void methodOne() {
		// some statements
	}
}

class SubClassA extends FinalMethod {
	@Override
	void methodOne() {
		// Compile time error
		// can not override final method
	}
}