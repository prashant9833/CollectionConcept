package com.demo.synchronizationcase1;

public class Display {
	
	public synchronized void wish(String name)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.print("Good Morning: ");
			try{
				
				Thread.sleep(2000);
			}catch(InterruptedException ex){
				
				ex.printStackTrace();
			}
			System.out.println(name);
		}
	}

}
