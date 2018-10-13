package com.java.threads.types.difference;

public class ThreadInjava {

	public static void main(String[] args) {

		UserThread userThread =  new UserThread();
		userThread.start();
		
		DaemonThread deamonThread = new DaemonThread();
		deamonThread.start();
	}

}
