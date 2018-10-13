package com.java.arrays.algorithm.observerpatternlab;

public class ObserverPatternLab {
	public static void main(String[] args) {
		AccountService accountService = new AccountService();
		accountService.createAccount();
		accountService.deposit();
		accountService.deposit();
	}
}
