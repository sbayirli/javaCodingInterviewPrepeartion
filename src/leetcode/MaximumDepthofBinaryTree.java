package leetcode;

import leetcode.helper.TreeNode;
/* 
 * leetcode 104. Maximum Depth of Binary Tree
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/ 
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

public class MaximumDepthofBinaryTree {
	public int maxDepth(TreeNode root) {
		if (root == null)
			return 0;
		else
			return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
	}
}
