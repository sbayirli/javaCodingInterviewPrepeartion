package leetcode;

import java.util.LinkedList;
import java.util.Queue;

import leetcode.helper.TreeNode;

/*
 * leetcode 938. Range Sum of BST
 * https://leetcode.com/problems/range-sum-of-bst/
 * */

/**
 * Definition for a binary tree node. 
 * public class TreeNode { 
 *  int val; 
 *  TreeNode left; 
 *  TreeNode right; 
 *  TreeNode(int x) 
 *  { 
 * 	 	val = x; 
 *  } 
 * }
 */
public class RangeSumofBST {
	public int rangeSumBST(TreeNode root, int L, int R) {
		int sum = 0;
		if (root == null)
			return sum;

		Queue<TreeNode> nodes = new LinkedList<TreeNode>();
		nodes.add(root);
		TreeNode current;

		while (!nodes.isEmpty()) {
			current = nodes.poll();
			if (current.val >= L && current.val <= R) {
				sum += current.val;
			}

			if (current.val > L && current.left != null) {
				nodes.add(current.left);
			}

			if (current.val < R && current.right != null) {
				nodes.add(current.right);
			}
		}

		return sum;
	}
}
