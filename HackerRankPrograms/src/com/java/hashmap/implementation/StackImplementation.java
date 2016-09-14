package com.java.hashmap.implementation;

public class StackImplementation {

	Node  head;
	
	class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	public void insertAtStart(int data)
	{
	   	Node new_node = new Node(data);
	   	
	     if(head == null)
	     {
	    	 head = new Node(data);
	    	 return;
	     }
	     
	     new_node.next = head;
	     
	     head = new_node;
	     
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackImplementation q = new StackImplementation();
		q.insertAtStart(60);
		q.insertAtStart(50);
		q.insertAtStart(40);
		q.insertAtStart(30);
		q.insertAtStart(20);
		q.insertAtStart(10);
		
		q.printList();
	}

}
