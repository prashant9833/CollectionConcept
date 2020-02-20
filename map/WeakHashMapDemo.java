package com.demo.map;

import java.util.*;

public class WeakHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Temp t1=new Temp("Prashant");
		HashMap m1=new HashMap();
		m1.put(t1,400);
		System.out.println(m1); 
		System.out.println("Here we create the Temp object as 'null'"); 
		t1=null;
		System.out.println("Called system.gc() for HashMap"); 
		System.gc();
		System.out.println(m1);
		
		System.out.println("===================================================================================");
		
		Temp t2=new Temp("Sonu");
		WeakHashMap m2=new WeakHashMap();
		m2.put(t2,500);
		System.out.println(m2);
		System.out.println("Here we creat Temp object as null");
		t2=null;
		System.out.println("Called system.gc() for WeakHashMap"); 
		System.gc();
		System.out.println(m2);
		
		
		
		

	}

}

class Temp
{
	
String name;

public Temp(String name)
{
	this.name=name;

}

public String toString()
{

	return name;

}

public void finalized()
{

	System.out.println("finalized is called.....");

}

}
