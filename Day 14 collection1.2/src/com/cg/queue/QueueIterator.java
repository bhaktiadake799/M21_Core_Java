package com.cg.queue;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
public class QueueIterator {

	public static void main(String[] args) {
		Queue<Integer> q=new ArrayDeque<Integer>();
		for (int i=11;i<15;i++)
		{
			q.add(i);
		}
		System.out.println(q);
		boolean isadded = q.offer(25);
		System.out.println("is added: "+isadded);
		System.out.println(q);
//		iterator is used to return single element separetely
		Iterator<Integer>itr =q.iterator();
		System.out.println("the element are: ");
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
