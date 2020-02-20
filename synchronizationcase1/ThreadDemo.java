package com.demo.synchronizationcase1;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Display d=new Display();
		MyThread t1=new MyThread(d,"Prashant");
		MyThread t2=new MyThread(d,"Ishant");
		t1.start();
		t2.start();

	}

}
