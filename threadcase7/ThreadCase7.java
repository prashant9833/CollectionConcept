package com.demo.threadcase7;

public class ThreadCase7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread t=new MyThread();
		
		t.start();
		
		System.out.println("I am in main() method.");

	}

}
