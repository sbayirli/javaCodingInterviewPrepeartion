package leetcode;

import java.util.LinkedList;
import java.util.Queue;

import leetcode.helper.TreeNode;

/* 
 * leetcode 297. Serialize and Deserialize Binary Tree
 * https://leetcode.com/problems/serialize-and-deserialize-binary-tree/ 
 * */
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
public class SerializeandDeserializeBinaryTree {

	// Encodes a tree to a single string.
	public String serialize(TreeNode root) {
		if (root == null)
			return "";
		Queue<TreeNode> q = new LinkedList();
		StringBuilder res = new StringBuilder();

		q.add(root);

		while (!q.isEmpty()) {
			TreeNode node = q.poll();
			if (node == null) {
				res.append("n ");
				continue;
			}
			res.append(node.val + " ");
			q.add(node.left);
			q.add(node.right);
		}

		return res.toString();
	}

	// Decodes your encoded data to tree.
	public TreeNode deserialize(String data) {
		if (data == "")
			return null;
		Queue<TreeNode> q = new LinkedList();
		String[] arr = data.split(" ");
		TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
		q.add(root);

		for (int i = 1; i < arr.length; i++) {
			TreeNode parent = q.poll();
			// left
			if (!arr[i].equals("n")) {
				TreeNode nodeLeft = new TreeNode(Integer.parseInt(arr[i]));
				parent.left = nodeLeft;
				q.add(nodeLeft);
			}
			// right
			if (!arr[++i].equals("n")) {
				TreeNode nodeRight = new TreeNode(Integer.parseInt(arr[i]));
				parent.right = nodeRight;
				q.add(nodeRight);
			}
		}
		return root;
	}
}
