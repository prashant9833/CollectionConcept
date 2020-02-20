package com.demo.thread2;

public class MyThread2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++){
			
			System.out.println("Child Thread");
		}

	}

}
