package com.demo.map;

import java.util.*;

public class NavigableMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NavigableMap m=new TreeMap();
		
		m.put("A",20);
		m.put("D",10);
		m.put("B",70);
		m.put("C",40);
		m.put("E",30);
		m.put("F",50);
		
		System.out.println(m); 
		
		System.out.println(m.floorKey("C")); //1
		System.out.println(m.lowerKey("C")); //2
		System.out.println(m.ceilingKey("C")); //3
		System.out.println(m.higherKey("C")); //4
		System.out.println(m.pollFirstEntry()); //5
		System.out.println(m.pollLastEntry()); //6
		System.out.println(m.descendingMap()); //7
		

	}

}
