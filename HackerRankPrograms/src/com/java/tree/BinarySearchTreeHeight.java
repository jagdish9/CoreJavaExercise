package com.java.tree;

import java.util.Queue;
import java.util.LinkedList;

class Node {
	int data;
	Node left, right;

	Node(int item) {
		data = item;
		left = right;
	}
}

public class BinarySearchTreeHeight {

	Node root;

	int treeHeight(Node node) {
		if (node == null)
			return 0;

		Queue<Node> q = new LinkedList<Node>();

		q.add(node);
		int height = 0;

		while (true) {
			int nodeCount = q.size();
			if (nodeCount == 0)
				return height;
			height++;

			while (nodeCount > 0) {
				Node newNode = q.peek();
				q.remove();

				if (newNode.left != null)
					q.add(newNode.left);
				if (newNode.right != null)
					q.add(newNode.right);
				nodeCount--;
			}
		}
	}

	public static void main(String[] args) {

		BinarySearchTreeHeight tree = new BinarySearchTreeHeight();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.right.right = new Node(5);

		System.out.println("The height of the binary tree is: "
				+ tree.treeHeight(tree.root));

	}

}

/*
 * 
 * /*
 * 
 * class Node int data; Node left; Node right;
 * 
 * int height(Node root) { if (root == null) { return -1; }
 * 
 * int left = height(root.left); int right = height(root.right);
 * 
 * if (left > right) { return left + 1; } else { return right + 1; } }
 */