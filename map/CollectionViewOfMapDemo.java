package com.demo.map;

import java.util.*;

public class CollectionViewOfMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap m=new HashMap();
		m.put(1,"A");
		m.put(2,"B");
		m.put(3,"C");
		m.put(4,"D");
		m.put(5,"E");
		
		System.out.println(m); 
		
		Set s=m.keySet();
		System.out.println(s); 
		
		Collection c=m.values();
		System.out.println(c); 
		
		Set s2=m.entrySet();
		System.out.println(s2); 
		
		Iterator itr=s2.iterator();
		while(itr.hasNext())
		{
			Map.Entry e=(Map.Entry)itr.next();
			
			System.out.println("Key is: "+e.getKey()+"---->"+"Value is: "+e.getValue()); 
		}
		

	}

}
