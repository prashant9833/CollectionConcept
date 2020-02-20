package com.demo.preventexecutionofthread;

public class ThreadJoinDemoCase4 {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		
		Thread.currentThread().join();
		System.out.println("DeadLock Created");

	}

}
