package com.demo.threadpriorityandname;

public class CustomThreadNameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 System.out.println("Main thread name before change: "+Thread.currentThread().getName());
	 Thread.currentThread().setName("Sonu");
	 System.out.println("Main thread name after change: "+Thread.currentThread().getName());
	 System.out.println(10/0);

	}

}
