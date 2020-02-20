package com.demo.map;

import java.util.*;

public class SortedMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortedMap m=new TreeMap(new MyComparator2());
		m.put(1,"A");
		m.put(2,"K");
		m.put(3,"B");
		m.put(4,"D");
		m.put(5,"C");
		m.put(6,"A");
		
		System.out.println(m); 
		
		System.out.println(m.firstKey()); 
		System.out.println(m.lastKey()); 
		System.out.println(m.headMap(4)); 
		System.out.println(m.tailMap(4)); 
		System.out.println(m.subMap(6,2)); 
		System.out.println(m.comparator());

		

	}

}

class MyComparator2 implements Comparator
{

public String toString()
{
	
return "Customized Sorting Order....";

}
	
public int compare(Object obj1,Object obj2)
{
	
Integer i1=(Integer)obj1;
Integer i2=(Integer)obj2;

return i2.compareTo(i1);

}

}
