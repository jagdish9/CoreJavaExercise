package com.practise;

public class DoubleLinkedList {

	    private static Node head;
	    private Node tail;
	    private int size;
	
	    public DoubleLinkedList()
	    {
	        size = 0;
	    }
	    
	 class Node{
		int data;
		Node next;
		Node prev;
		
		public Node(int data, Node next, Node prev){
			this.data = data;
			this.next = next;
			this.prev = prev;
		}
	}
	
	public void insertAfterNode(int data)
	{
		    Node tmp = new Node(data, null, tail);
	        if(tail != null)
	        {
	        	tail.next = tmp;
	        }
	        tail = tmp;
	        if(head == null) 
	        { 
	        	head = tmp;
	        }
	        size++;
	        System.out.println("adding: "+data);
	}
	
	public int size() 
	{ 
		return size; 
	}
	
	 public boolean isEmpty()
	 { 
		 return size == 0;
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
		// TODO Auto-generated method stub

		DoubleLinkedList dl =  new DoubleLinkedList();
		dl.insertAfterNode(20);
		dl.insertAfterNode(30);
		dl.insertAfterNode(40);
		
		printList();
	}

}
