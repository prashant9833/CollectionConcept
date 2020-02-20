package com.demo.map;

import java.util.*;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap m=new LinkedHashMap();
		m.put(1,"A");
		m.put(2,"A");
		m.put(null,null);
		m.put(3,null);
		m.put("B",20);
		m.put("C",30);
		m.put(null,50);
		m.put(2,"K");
		
		System.out.println(m); 
		

	}

}
