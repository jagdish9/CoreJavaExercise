package com.java.queue;

import java.io.PrintStream;

public class Queue01 {

	protected int queue[];
	protected int front, rear, size, len;
	
	public Queue01(int n)
	{
		size = n;
		len = 0;
		queue = new int[size];
		front = -1;
		rear = -1;
	}
	
	public boolean isEmpty()
	{
		return front == -1;
	}
	
	public boolean isFull()
	{
		return front == 0 && rear == size-1;
	}
	
	public int getSize()
	{
		return len;
	}
	
	public int peek()
	{
		if(isEmpty())
		{
			PrintStream ps = System.out;
			ps.println("There is no element in queue");
		}
		
		return queue[front];
	}
	
	public void add(int i)
	{
		if(rear == -1)
		{
			front = 0;
			rear = 0;
			queue[rear] = i;
			len++;
		}
		else if(rear+1 >= size)
		{
			System.out.println("There is no space");
		}
		else if(rear+1 < size)
		{
			queue[++rear] = i;
			len++;
		}
	}
	
	public int poll()
	{
		int ele = 0;
		if(isEmpty())
		{
			System.out.println("There are no elements");
		}
		else
		{
			len--;
			ele = queue[front];
			if(front == rear)
			{
				front = -1;
				rear = -1;
			}
			else
			{
				front++;
			}
			
		}
		return ele;
	}
	
	public void display()
	{
		System.out.print("\nQueue = ");
		if(len == 0)
		{
			System.out.print("Empty\n");
			return;
		}
		else
		{
			for(int i = front; i<= rear; i++)
			{
				System.out.print(queue[i]+" ");
			}
			System.out.println();
		}
	}
}
