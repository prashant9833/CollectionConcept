package com.demo.threadpriorityandname;

public class CustomThreadPriorityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Default Priority of Main Thread: "+Thread.currentThread().getPriority());
		
		Thread.currentThread().setPriority(7);
		
		System.out.println("New Priority of Main Thread: "+Thread.currentThread().getPriority());
	}

}
