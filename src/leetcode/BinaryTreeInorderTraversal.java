package leetcode;

import java.util.ArrayList;
import java.util.List;

import leetcode.helper.TreeNode;

/*
 * leetcode 94. Binary Tree Inorder Traversal
 * https://leetcode.com/problems/binary-tree-inorder-traversal/
 * */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BinaryTreeInorderTraversal {
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList();
		inOrderRec(root, list);
		return list;
	}

	public void inOrderRec(TreeNode root, List<Integer> list) {
		if (root != null) {
			inOrderRec(root.left, list);
			list.add(root.val);
			inOrderRec(root.right, list);
		}
	}
}

