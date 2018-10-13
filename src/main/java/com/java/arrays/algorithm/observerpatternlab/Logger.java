package com.java.arrays.algorithm.observerpatternlab;

public class Logger extends Observer {

	Logger(AccountService accountService) {
		this.accountservice = accountService;
	}

	@Override
	public void actionOccour(String msg) {
		System.out.println("Log Action:" + msg);
	}
}