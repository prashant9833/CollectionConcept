package com.demo.threadcase9;

public class ThreadCase9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread t=new MyThread();
		t.start();
		System.out.println("Main Thread");
		t.start();

	}

}
