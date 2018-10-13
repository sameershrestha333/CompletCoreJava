package com.java.polymorphism.methodOverriding;

class SuperClassA {
	protected void methodOfSuperClass() {
		System.out.println("From Super Class");
	}
}

class SubClassA extends SuperClassA {
	private void methodOfSuperClass() {
		// Compile time error, can't reduce visibility of overrided method
		// here, visibility must be protected or public but not private or default
	}
}