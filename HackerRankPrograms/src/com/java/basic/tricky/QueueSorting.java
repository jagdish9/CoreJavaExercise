package com.java.basic.tricky;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*class SortedQueue implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		if(o1>o2)
			return 1;
		else if (o1 == o2)
			return 0;
		else
			return -1;
	}

	
}*/
public class QueueSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> pq = new LinkedList<Integer>();
		pq.add(42);
		pq.add(20);
		pq.add(79);
		pq.add(19);
		pq.add(9);
		
		List<Integer> ls = new LinkedList<Integer>(pq);
		Collections.sort(ls);
		
		System.out.println(pq);
		System.out.println(ls);
	}

}

