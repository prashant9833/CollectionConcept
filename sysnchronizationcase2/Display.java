package com.demo.sysnchronizationcase2;

public class Display {
	
	public static synchronized void wish(String name)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.print("Good Afternoon: ");
		    
			try{
				Thread.sleep(2000);
			}catch(InterruptedException ex){
				
				ex.printStackTrace();
			}
			System.out.println(name);
		}
	}

}
