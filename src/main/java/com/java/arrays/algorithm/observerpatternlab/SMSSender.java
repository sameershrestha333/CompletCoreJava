package com.java.arrays.algorithm.observerpatternlab;

public class SMSSender extends Observer {

	SMSSender(AccountService accountService) {
		this.accountservice = accountService;
	}

	@Override
	public void actionOccour(String msg) {
		System.out.println("SMS Action:" + msg);
	}

}