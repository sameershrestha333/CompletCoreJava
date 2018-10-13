package com.java.enumdemo;

interface AnyInterface {
	abstract void methodOfInterface();
}
class A{
	
}

enum enumA extends A {
	A, B, C;

	@Override
	public void methodOfInterface() {
		// MethodOfInterface is implemented
	}
}

enum enumB implements AnyInterface {
	A, B, C;

	@Override
	public void methodOfInterface() {
		// MethodOfInterface is implemented
	}
}