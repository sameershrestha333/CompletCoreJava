package com.java.arrays.algorithm.observerpatternlab;

public abstract class Observer {
	protected AccountService accountservice;

	abstract void actionOccour(String msg);
}