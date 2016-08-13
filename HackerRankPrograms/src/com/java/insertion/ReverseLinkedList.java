package com.java.insertion;

public class ReverseLinkedList {

	class Node {
		int data;
		Node next;
	}

	// This is a "method-only" submission.
	// You only need to complete this method.

	Node ReversePrint(Node head) {
		// This is a "method-only" submission.
		// You only need to complete this method.
		Node prev = null;
		Node current = head;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		Node temp = head;

		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}

		return head;
	}
}
