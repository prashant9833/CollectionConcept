package com.demo.preventexecutionofthread;

class MyThread extends Thread
{
  public void run()
  {
	  System.out.println("Child Thread");
  }

}

public class YeildDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread t=new MyThread();
		t.setPriority(3);
		t.start();
		Thread.yield();
		System.out.println("Main Thread");

	}

}
