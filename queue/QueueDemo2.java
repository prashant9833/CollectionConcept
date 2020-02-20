package com.demo.queue;

import java.util.*;

public class QueueDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue q=new PriorityQueue(18,new MyComparator());
		
		q.offer(new StringBuffer("D"));
		q.offer(new StringBuffer("E"));
		q.offer(new StringBuffer("A"));
		q.offer(new StringBuffer("C"));
		q.offer(new StringBuffer("B"));
		
		System.out.println(q); 
		
		System.out.println(q.peek());
		System.out.println(q.poll()); 
		System.out.println(q.element());
		System.out.println(q.remove());
		System.out.println(q); 

	}

}

class MyComparator implements Comparator
{

	@Override
	public int compare(Object obj1, Object obj2) {
		// TODO Auto-generated method stub
		
		String s1=obj1.toString();
		String s2=obj2.toString();
		
		return s2.compareTo(s1);
		
	}
	
}

