package com.java.threads.types;

public class ThreadsInJava {

	public static void main(String[] args) {
		UserThread userThread = new UserThread();// creating thread
		System.out.println(userThread.isDaemon());
		userThread.setDaemon(true);
		System.out.println(userThread.isDaemon());
		// userThread.start();

	}

}
