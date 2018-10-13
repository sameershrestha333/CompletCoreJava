package com.java.collections.queue;

import java.util.PriorityQueue;

public class TestEmployee {

	public static void main(String[] args) {
		MyComparator comparator = new MyComparator();Comparable<T>
		PriorityQueue<Employee> pQueue = new PriorityQueue<>(comparator);

		pQueue.offer(new Employee("AAA", 15000));

		pQueue.offer(new Employee("BBB", 12000));

		pQueue.offer(new Employee("CCC", 7500));

		pQueue.offer(new Employee("DDD", 17500));

		pQueue.offer(new Employee("EEE", 21500));

		pQueue.offer(new Employee("FFF", 29000));

		pQueue.offer(new Employee("GGG", 14300));
		
		System.out.println(pQueue.poll());       //Output --> CCC : 7500
		 
		System.out.println(pQueue.poll());       //Output --> BBB : 12000
		 
		System.out.println(pQueue.poll());       //Output --> GGG : 14300
		 
		System.out.println(pQueue.poll());       //Output --> AAA : 15000
		 
		System.out.println(pQueue.poll());       //Output --> DDD : 17500
		 
		System.out.println(pQueue.poll());       //Output --> EEE : 21500
		 
		System.out.println(pQueue.poll()); 
	}

}
