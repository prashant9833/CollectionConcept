package com.demo.queue;

import java.util.*;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue q=new PriorityQueue();
		
		for(int i=1;i<=10;i++)
		{
			
			q.offer(i); //1 
		}
		
		System.out.println(q); 
		System.out.println(q.peek()); //2
        System.out.println(q.poll()); //3
        System.out.println(q.remove()); //4
        System.out.println(q.element()); //5
        

	}

}
