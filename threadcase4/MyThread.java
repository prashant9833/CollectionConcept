package com.demo.threadcase4;

public class MyThread extends Thread {
	
	public void run(){
		
		System.out.println("0-arg method()");
	}
	
	public void run(int i){
		
		System.out.println("param-arg method()");
	}

}
