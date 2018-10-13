package com.java.threads.types;

public class UserThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("This is a user thread.. " + i);
		}

	}
}
