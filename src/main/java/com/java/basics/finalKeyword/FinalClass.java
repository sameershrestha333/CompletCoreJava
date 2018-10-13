package com.java.basics.finalKeyword;

final class FinalClass {
	// some statements
}

class SubClass extends FinalClass {
	// compile time error
	// Can't create sub class to the final class
}