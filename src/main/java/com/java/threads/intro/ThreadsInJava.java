package com.java.threads.intro;

public class ThreadsInJava {

	public static void main(String[] args) {
		Thread1 thread1 = new Thread1();
		thread1.start();
		
		Thread2 thread2 = new Thread2();
		thread2.start();
	}

}
