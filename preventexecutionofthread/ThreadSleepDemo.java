package com.demo.preventexecutionofthread;

public class ThreadSleepDemo {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=10;i++){
			
			System.out.println(i);
			Thread.sleep(3000);
		}
		for(char j=65;j<=75;j++){
			
			System.out.println(j);
			Thread.sleep(3000);
		}

	}

}
