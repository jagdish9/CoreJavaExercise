package com.java.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraverse {

	 class Node{
	 int data; 
	 Node left;
	 Node right;
	 }
	 
	void LevelOrder(Node root) {
		if (root == null)
			return;
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);

		while (!q.isEmpty()) {
			Node temp = q.poll();
			System.out.print(temp.data + " ");
			if (temp.left != null)
				q.add(temp.left);
			if (temp.right != null)
				q.add(temp.right);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
