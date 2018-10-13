package com.java.enumdemo;

enum DirectionA {
	SOUTH, NORTH, EAST, WEST;

	private DirectionA() {
		// Only private constructors are allowed
	}
	public static void main(String[] args) {
		DirectionA obj = new DirectionA();
	}

	public DirectionA(int i) {
		// Compile time error, public constructors are not allowed
	}
}
