package com.java.insertion;

public class NodeOnTail {

	class Node {
		int data;
		Node next;
	}

	Node Insert(Node head, int data) {
		// This is a "method-only" submission.
		// You only need to complete this method.

		Node temp = head;
		Node newnode = new Node();
		newnode.data = data;
		newnode.next = null;
		if (temp == null) {
			head = newnode;
			return head;
		} else {
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newnode;
			return head;
		}

	}
}
