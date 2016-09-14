package com.java.hashmap.implementation;

public class QueueImplementation {

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
		if(head == null)
		{
			head = new Node(data);
			return;
		}
		
		Node new_node = new Node(data);
		
		new_node.next = null;
		
		Node temp = head;
		
		while(temp.next != null)
		{
			temp = temp.next;
		}
		
		temp.next = new_node;
		
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

		QueueImplementation q = new QueueImplementation();
		q.insertAtLast(10);
		q.insertAtLast(20);
		q.insertAtLast(30);
		q.insertAtLast(40);
		q.insertAtLast(50);
		
		q.printList();
	}

}
