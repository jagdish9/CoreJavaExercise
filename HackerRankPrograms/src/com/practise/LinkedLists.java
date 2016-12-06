package com.practise;

public class LinkedLists {

	static Node head;
	
	static class Node{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data = data;
			next = null;
		}
	}
	
	public static void insertAtLast(int data)
	{
		if(head == null)
		{
			head = new Node(data);
			return;
		}
		
		Node new_node = new Node(data);
		Node temp = head;
		while(temp.next != null){
			temp = temp.next;
		}
		
		temp.next = new_node;
	}
	
	public static void insertAtFirst(int data)
	{
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
	}
	
	public static void insertAfterNode(Node prev_node, int data)
	{
		Node new_node = new Node(data);
		Node temp = head;
		while(temp.next != prev_node)
		{
			temp = temp.next;
		}
		
		new_node.next = temp.next;
		temp.next = new_node;
	}
	
	public static void deleteFromFirst()
	{
	  	head = head.next;
	}
	
	public static void deleteWithoutNode(int data)
	{
	  	Node temp = head;
	  	while(temp.data != data)
	  	{
	  		temp = temp.next;
	  	}
	  	
	  	Node temp1 = head;
	  	while(temp1.next != temp)
	  	{
	  		temp1 = temp1.next;
	  	}
	  	temp1.next = temp.next;
	}
	
	public static void reverseList()
	{
	   Node current = head;
	   Node prev_node = null;
	   Node next_node = null;
	   
	   while(current!= null)
	   {
		   next_node = current.next;
		   current.next = prev_node;
		   prev_node = current;
		   current = next_node;
	   }
	   head = prev_node;
	}
	
	public static void printList()
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	public static void main(String[] args) {
		
		//LinkedLists ls =  new LinkedLists();
		// TODO Auto-generated method stub
		insertAtLast(20);
		insertAtLast(30);
		insertAtLast(40);
		insertAtLast(50);
		insertAtFirst(10);

		insertAfterNode(head.next.next, 60);
		printList();
		
		System.out.println();
		deleteFromFirst();
		printList();
		
		System.out.println();
		deleteWithoutNode(40);
		printList();
		
		System.out.println();
		reverseList();
		printList();;
	}

}
