package com.java.inheritance.point1;

class A {

	int i;
	// SIB : static Initialization Block
	static {
		System.out.println("Class A SIB");
	}

	// IIB : Instance Initialization Block
	{
		System.out.println("Class A IIB");
	}

	// Constructor
	A() {
		System.out.println("Class A Constructor");
	}
}

class B extends A {
	int j;
}

