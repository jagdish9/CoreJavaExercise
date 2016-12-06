package com.java.onmobile;

public class SumOfLinkedList {

	Node head;
	class Node
	{
		int data;
		Node next;
		
		public Node(int d)
		{
			data =  d;
			next = null;
		}
	}
	
	public static void sumOfList(Node node1, Node node2)
	{
		Node sum = new SumOfLinkedList().new Node(0);
		while(node1 != null && node2 != null)
		{
			sum.data = node1.data + node2.data;
			node1 = node1.next;
			node2 = node2.next;
			printList(sum.data);
		}
		while(node1 != null)
		{
			sum.data = node1.data;
			node1 = node1.next;
			printList(sum.data);
		}
		while(node2 != null)
		{
			sum.data = node2.data;
			node2 = node2.next;
			printList(sum.data);
		}
	}
	
	public static void printList(int data)
	{
		System.out.print(data+" ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SumOfLinkedList _sol_1 = new SumOfLinkedList();
		SumOfLinkedList _sol_2 = new SumOfLinkedList();
		
		_sol_1.head = _sol_1.new Node(10);
		_sol_1.head.next = _sol_1.new Node(20);
		_sol_1.head.next.next = _sol_1.new Node(30);
		
		_sol_2.head = _sol_2.new Node(5);
		_sol_2.head.next = _sol_2.new Node(5);
		_sol_2.head.next.next = _sol_2.new Node(5);
		
		sumOfList(_sol_1.head, _sol_2.head);
	}

}
