package com.java.series;

public class GetNodeValueFromPrevious {

	class Node {
		int data;
		Node next;
	}

	int GetNode(Node head, int n) {
		// This is a "method-only" submission.
		// You only need to complete this method.

		Node cur = head;
		Node prev = new Node();
		Node next = null;
		int value = 0;

		while (cur != null) {
			next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next;
		}

		for (int i = 0; i < n; i++) {
			prev = prev.next;
		}

		value = prev.data;

		return value;
	}

}
