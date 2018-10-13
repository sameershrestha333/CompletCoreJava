package com.java.basics.constructors;

class D {
	private D() {
		// Private Constructor
	}

	void methodOne() {
		// You can use private constructor inside the class
		D d1 = new D();
	}
}

class MainClass {
	public static void main(String[] args) {
		// You can't use private constructor ouside the class like this
		// D d1 = new D();
	}
}