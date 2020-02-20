package com.demo.core;

public class ThrowsDemo {

	public static void main(String[] args)throws InterruptedException {
		
		for(int i=1;i<=5;i++)
		{
		Thread.sleep(2000);
		System.out.println(i);
		}
		
	}

}
