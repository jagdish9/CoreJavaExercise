package com.java.onmobile;

public class DeleteLinkedList {

	static Node head;
	
	static class Node
	{
		int data;
		Node next;
		
		public Node(int d)
		{
			data = d;
			next = null;
		}
	}
	
	public static void deleteNode(Node n)
	{
		Node node = head;
	  // When node to be deleted is head node
	  if(node == n)
	  {
		  if(node.next == null)
		  {
			  System.out.println("There is only one node, list can not be empty");
			  return;
		  }
		  
		  node.data = node.next.data;
		  n = node.next;
		  
		  node.next = node.next.next;
		  return;
	  }
	  
	// When not first node
	  Node prev = node;
      while (prev.next != null && prev.next != n) {
          prev = prev.next;
      }

      // Check if node really exists in Linked List
      if (prev.next == null) {
          System.out.println("Given node is not present in Linked List");
          return;
      }

      // Remove node from Linked List
      prev.next = prev.next.next;
      
      return;
	}
	
	public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println("");
    }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     //  DeleteLinkedList list = new DeleteLinkedList();
	        head = new Node(12);
	        head.next = new Node(15);
	        head.next.next = new Node(10);
	        head.next.next.next = new Node(11);
	        head.next.next.next.next = new Node(5);
	        head.next.next.next.next.next = new Node(6);
	        head.next.next.next.next.next.next = new Node(2);
	        head.next.next.next.next.next.next.next = new Node(3);
	 
	        System.out.println("Given Linked List :");
	        printList(head);
	        System.out.println("");
	         
	        // Let us delete the node with value 10
	        System.out.println("Deleting node :" + head.next.next.data);
	        deleteNode(head.next.next);
	 
	        System.out.println("Modified Linked list :");
	        printList(head);
	        System.out.println("");
	 
	        // Lets delete the first node
	        System.out.println("Deleting first Node");
	        deleteNode(head);
	        System.out.println("Modified Linked List");
	        printList(head);
	        
	}

}
