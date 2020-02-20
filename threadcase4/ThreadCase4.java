package com.demo.threadcase4;

public class ThreadCase4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread t=new MyThread();
		t.start();
		t.run(10);

	}

}
