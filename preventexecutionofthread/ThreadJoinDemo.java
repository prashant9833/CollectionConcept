package com.demo.preventexecutionofthread;

class MyThread1 extends Thread
{
	static Thread mt;
  
	public void run()
	{
		try{
		mt.join();
		for(int i=1;i<=5;i++)
		{
		System.out.println("Child Thread");
		Thread.sleep(2000);
		
		}
		}catch(InterruptedException ex){
			
			ex.printStackTrace();
		}
	}

}

public class ThreadJoinDemo {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		
		MyThread1.mt=Thread.currentThread();
		MyThread1 t=new MyThread1();
		t.start();
		t.join(); //----> Case-1/2/3
		for(int i=1;i<=5;i++)
		{
		System.out.println("Main Thread");
		}

	}

}
