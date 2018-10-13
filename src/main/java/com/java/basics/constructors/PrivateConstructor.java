package com.java.basics.constructors;

public class PrivateConstructor {

	private static PrivateConstructor privateConstructor = null;

	private PrivateConstructor() {
		// private constructor
	}

	public PrivateConstructor getObject() {
		if (privateConstructor == null) {
			privateConstructor = new PrivateConstructor(); // Creating object using private constructor
		}

		return privateConstructor;
	}
}
