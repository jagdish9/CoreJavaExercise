package com.java.tree;

import java.util.Stack;

public class BinaryTree {

	public static class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;

		TreeNode(int data) {
			this.data = data;
		}
	}

	public void preOrderIterator(TreeNode root) {
		if (root == null)
			return;

		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);

		while (!stack.empty()) {
			TreeNode node = stack.pop();
			System.out.print(node.data + " ");

			if (node.right != null) {
				stack.push(node);
			}

			if (node.left != null) {
				stack.push(node);
			}
		}

	}

	/*
	 * public void preOrderIterator(TreeNode root) { if(root != null) {
	 * System.out.print(root.data+" "); preOrderIterator(root.left);
	 * preOrderIterator(root.right); } }
	 */

	public static TreeNode createBinaryTree() {
		TreeNode rootNode = new TreeNode(60);
		TreeNode node20 = new TreeNode(20);
		TreeNode node30 = new TreeNode(30);
		TreeNode node40 = new TreeNode(40);
		TreeNode node50 = new TreeNode(50);
		TreeNode node10 = new TreeNode(10);
		TreeNode node5 = new TreeNode(5);

		rootNode.left = node20;
		rootNode.right = node40;

		node20.left = node30;
		node20.right = node5;

		node40.left = node50;
		node40.right = node10;

		return rootNode;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTree binaryTree = new BinaryTree();
		TreeNode treeNode = createBinaryTree();

		System.out.println("Pre-order using iterator");
		binaryTree.preOrderIterator(treeNode);
	}

}
