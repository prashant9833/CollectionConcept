package com.demo.threadcase6;

public class MyThread extends Thread {
	
	public void start(){
		
		System.out.println("I am in user-defined start()");
	}
	
	public void run(){
		
		System.out.println("I am in user-defined run()");
	}

}
