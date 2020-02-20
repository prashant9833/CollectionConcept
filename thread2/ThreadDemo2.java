package com.demo.thread2;

public class ThreadDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread2 t1=new MyThread2();
		Thread t2=new Thread(t1);
		t2.start();
		
		for(int i=1;i<=5;i++){
			
			System.out.println("Main Thread");
		}

	}

}
