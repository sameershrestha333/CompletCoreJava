package com.java.basics.constructors;

class A {
	final A() {
		// Constructor can not be final
	}

	static A() {
		// Constructor can not be static
	}

	abstract A()
     {
        //Constructors can not be abstract
     }
}