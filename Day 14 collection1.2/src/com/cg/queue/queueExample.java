package com.cg.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class queueExample {

	public static void main(String[] args) {
		Queue<Object>q=new ArrayDeque<Object>();
		q.add(23);
		q.add(29);
		q.add(93);
		System.out.println(q);
		System.out.println(q.peek());
		Queue<Object>q1=new PriorityQueue<Object>();
		q1.add(23);
		q1.add(8);
		q1.add(93);
		System.out.println(q1);
		System.out.println(q1.peek());
		System.out.println(q1.remove());
		System.out.println(q1);
		System.out.println(q1.poll());
		System.out.println(q1);

	}

}
