package com.java.stack;

public class ArrayStack {

	protected int arr[];
	protected int top, size, len;
	
	public ArrayStack(int n)
	{
		size = n;
		len = 0;
		arr = new int[size];
		top = -1;
	}
	
	public boolean isEmpty()
	{
		return top == -1;
	}
	
	public boolean isFull()
	{
		return top == size-1;
	}
	
	public int getSize()
	{
		return len;
	}
	
	public int peek()
	{
		if(isEmpty())
			System.out.println("Stack is empty");
		
		return arr[top];
	}
	
	public void add(int i)
	{	
		if(top+1 >= size)
		{
			System.out.println("There is no space");
		}
		else if(top+1 < size)
		{
			arr[++top] = i;
			len++;
		}
	}
	
	public int poll()
	{
		if(isEmpty())
			System.out.println("There are no elements");
		
		len--;
		return arr[top--];
	}
	
	public void dispaly()
	{
		System.out.print("\nStack = ");
		if(isEmpty())
		{
			System.out.println("There are no elements in stack, stack is empty");
		    return;
		}
		else{
			for(int j = 0; j <= top; j++)
			{
				System.out.print(arr[j]+" ");
			}
			System.out.println();
		}
			
	}
}
