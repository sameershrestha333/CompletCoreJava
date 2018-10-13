package com.java.threads.types.difference;

public class DaemonThread extends Thread {

	public DaemonThread() {
		setDaemon(true);
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("I am Daemon Thread ... " + i);
		}
	}
}
