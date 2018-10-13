package com.java.arrays.algorithm.observerpatternlab;
public class EmailSender extends Observer{

		EmailSender(AccountService accountService){
			this.accountservice=accountService;
		}
		@Override
		public void actionOccour(String msg) {
			System.out.println("Email Send:"+msg);
		}
		
	}