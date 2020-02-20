package com.demo.map;

import java.util.*;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer i1=new Integer(80);
		
		Integer i2=new Integer(80);
		
		HashMap m1=new HashMap();
		m1.put(i1,"A");
		m1.put(i2,"B");
		
		System.out.println(m1);
		
		
		System.out.println("--------------------------------------------------");
		
		IdentityHashMap m2=new IdentityHashMap();
		m2.put(i1,"J");
		m2.put(i2,"K");
		
		System.out.println(m2);
		

	}

}
