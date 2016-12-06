package com.doubles.linkedlist;

public class DoubleLinkedList {

static Nodes head;
	
	static class Nodes{
		int data;
		Nodes next;
		Nodes prev;
		
		public Nodes(int data){
			this.data = data;
			next = null;
			prev = null;
		}
	}
	
	public static void insertAfterNode(int data)
	{
		if(head == null);
		{
			head = new Nodes(data);
			return;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
