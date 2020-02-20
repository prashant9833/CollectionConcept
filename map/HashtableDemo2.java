package com.demo.map;

import java.util.*;

public class HashtableDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable t=new Hashtable();
		
		t.put(new Temp2(20),"A");
		t.put(new Temp2(50),"B");
		t.put(new Temp2(10),"C");
		t.put(new Temp2(30),"D");
		t.put(new Temp2(40),"E");
		
		System.out.println(t);

	}

}

class Temp2{
	
	int n;
	
	public Temp2(int n)
	{
		
		this.n=n;
	}
	
	public int hashCode()
	{
		return n%20;
		
	}
	
	public String toString()
	{
		
		return n+"";
	}
}
