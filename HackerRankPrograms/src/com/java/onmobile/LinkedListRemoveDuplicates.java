package com.java.onmobile;

public class LinkedListRemoveDuplicates {

	static Node head;
	
	static class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	
	public static void removeDuplicates()
	{
		Node ptr1 = null;
		Node ptr2 = null;
		Node dups = null;
		ptr1 = head;
		
		while(ptr1 != null && ptr1.next != null)
		{
			ptr2 = ptr1;
			
			while(ptr2.next != null)
			{
				if(ptr1.data == ptr2.next.data)
				{
					dups = ptr2.next;
					ptr2.next = ptr2.next.next;
					
				}
				else{
					ptr2 = ptr2.next;
				}
			}
			ptr1 = ptr1.next;
		}
	}
	
	public static void printList(Node node)
	{
		while(node != null)
		{
			System.out.println(node.data+" ");
			node = node.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	LinkedListRemoveDuplicates list = new LinkedListRemoveDuplicates();
		head = new Node(10);
        head.next = new Node(12);
        head.next.next = new Node(11);
        head.next.next.next = new Node(11);
        head.next.next.next.next = new Node(12);
        head.next.next.next.next.next = new Node(11);
        head.next.next.next.next.next.next = new Node(10);
 
        System.out.println("Linked List before removing duplicates ");
        
        printList(head);
 
        removeDuplicates();
        System.out.println("");
        System.out.println("Linked List after removing duplicates");
        printList(head);
 
	}

}
