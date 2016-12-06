package com.java.onmobile;

public class SortingLinkedList {

	static Node head;
	class Node
	{
		int data;
		Node next;
		public Node(int d)
		{
			data = d;
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
	   
	   Node temp = head;
	  
	   while(temp.next != null)
	   {
		   temp = temp.next;
	   }
	   
	   temp.next = new_node;
	   return;
	   
	}
	
	public void printList(Node node1)
	{
		while(node1 != null)
		{
			System.out.print(node1.data+" ");
			node1 = node1.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SortingLinkedList sl = new SortingLinkedList();
		sl.insertAtLast(20);
		sl.insertAtLast(30);
		sl.insertAtLast(40);
		sl.insertAtLast(50);
		
		sl.printList(head);
	}

}
