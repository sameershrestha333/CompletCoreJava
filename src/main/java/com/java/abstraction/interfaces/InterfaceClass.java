package com.java.abstraction.interfaces;

interface InterfaceClass {
	void methodOne();
}

class AnyClass implements InterfaceClass {
	void methodOne() {
		// It gives compile time error.
		// Interface methods must be implemented as public
	}
}