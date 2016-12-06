package com.java.doubly.linkedlist;

public class DoublyLinkedList<E> {

	private Node head;
	private Node tail;
	private int size;
	
	public DoublyLinkedList()
	{
		size = 0;
	}
	
	private class Node{
		E element;
		Node next;
		Node prev;
		
		public Node(E element, Node next, Node prev){
			this.element = element;
			this.next = next;
			this.prev = prev;
		}
	}
	
	public int getSize()
	{
		return size;
	}
	
	public boolean isEmpty(){
		return size == 0;
	}
	
	public void addFirst(E element)
	{
		
	}
}
