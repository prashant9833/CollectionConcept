package com.demo.sysnchronizationcase2;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Display d1=new Display();
		Display d2=new Display();
		
		MyThread t1=new MyThread(d1,"Prashant");
		MyThread t2=new MyThread(d2,"Ishant");
		
		t1.start();
		t2.start();

	}

}
