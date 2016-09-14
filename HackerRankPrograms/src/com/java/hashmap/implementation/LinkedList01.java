package com.java.hashmap.implementation;

public class LinkedList01 {

	Node head;
	
	class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
			next = null;
		}
	}
	
	public void insertAtLast(int data)
	{
	    Node new_node = new Node(data);
	    
	    if(head == null)
	    {
	    	head = new Node(data);
	    	return;
	    }
	    
	    new_node.next = null;
	    
	    Node last = head;
	    
	    while(last.next != null)
	    {
	    	last = last.next;
	    }
	    
	    last.next = new_node;
	}
	
	public void insertAtStart(int data)
	{
	  Node new_node = new Node(data);
	  
	  new_node.next = head;
	  
	  head = new_node;
	}
	
	public void insertAfter(Node prev_node, int data)
	{
		if(prev_node == null)
		{
			System.out.println("Previous node can not be null");
			return;
		}
		
		Node new_node = new Node(data);
		
		new_node.next = prev_node.next;
		
		prev_node.next = new_node;
	}
	
	public void printList()
	{
	  Node temp = head;
	  while(temp != null)
	  {
		  System.out.print(temp.data+" ");
		  temp = temp.next;
	  }
	}
	
	public static void main(String[] args)
	{
		
		LinkedList01 ls = new LinkedList01();
		ls.insertAtLast(50);
		ls.insertAtLast(30);
		ls.insertAtStart(20);
		ls.insertAfter(ls.head.next, 76);
		ls.insertAtLast(10);
		ls.printList();
	}
}
