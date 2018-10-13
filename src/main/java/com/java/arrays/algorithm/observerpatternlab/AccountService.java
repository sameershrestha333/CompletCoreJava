package com.java.arrays.algorithm.observerpatternlab;

import java.util.ArrayList;
import java.util.List;

class AccountService {

	List<Observer> observerList = new ArrayList<Observer>();
	EmailSender emailSender = new EmailSender(this);

	public AccountService() {
		observerList.add(new Logger(this));
		observerList.add(new SMSSender(this));

	}

	private void sendChanges(String changeInMessage) {
		for (Observer obs : observerList) {
			obs.actionOccour(changeInMessage);
		}
	}

	private void createAccountEmail() {
		emailSender.actionOccour("Create Account");
	}

	public void createAccount() {
		sendChanges("Create Account");
		createAccountEmail();
	}

	public void deposit() {
		sendChanges("Deposit");
	}

	public void withdraw() {
		sendChanges("Withdraw");
	}

	public void transferFunds() {
		sendChanges("Transfer Fund");
	}

	public void getAllAccounts() {
		sendChanges("getAllAccounts");
	}

	public void getAccount() {
		sendChanges("get Account");
	}
}