package com.demo.set;

import java.util.*;

public class SortedSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortedSet s=new TreeSet();
		
		s.add(10);
		s.add(30);
		s.add(20);
		s.add(40);
		s.add(50);
		s.add(5);
		s.add(60);
		
		System.out.println(s);
		System.out.println(s.first()); //1
		System.out.println(s.last()); //2
		System.out.println(s.headSet(40)); //3
		System.out.println(s.tailSet(40)); //4
		System.out.println(s.subSet(20,60)); //5
		System.out.println(s.comparator()); //6
		
		

	}

}
