package com.demo.interupt;

class MyThread extends Thread
{
  public void run(){
	  
	  for(int i=1;i<=100;i++){
		  
		  System.out.println(i);
	  }
	  System.out.println("I am lazy thread & I want to sleep");
	  try{
		  
		  Thread.sleep(2000);
	  }catch(InterruptedException ex){
		  

        System.out.println("I got Interrupted");
	  }
  }	

}

public class ThreadInterruptDemo {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		
		MyThread t=new MyThread();
		t.start();
		t.join(1000);
		t.interrupt();
		System.out.println("I am under main thread");
		

	}

}
