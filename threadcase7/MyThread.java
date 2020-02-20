package com.demo.threadcase7;

public class MyThread extends Thread {
	
	public void start(){
		
		super.start();
		System.out.println("I am in user-defined start() method.");
	}

	public void run(){
		
		System.out.println("I am in user-defined run() method.");
	}
}
