package com.java.insertion;

public class InsertOnSpecified {

	class Node {
		int data;
		Node next;
	}

	Node InsertNth(Node head, int data, int position) {
		// This is a "method-only" submission.
		// You only need to complete this method.
		Node temp = head;
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		if (temp == null) {
			head = newNode;
			return head;
		}

		else if (position > 0) {
			for (int i = 0; i < position - 1; i++) {
				temp = temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode;
			return head;
		}

		else {
			newNode.next = temp;
			head = newNode;
			return head;
		}
	}

}
