package z5;

import tools.TreeNode;

public class BST_Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static TreeNode insertIterative(TreeNode root, int val) {
		//返回新节点
		TreeNode pre = null;
		TreeNode curr = root;
		while(curr != null) {
			if(curr.value > val) {
				pre = curr;
				curr = curr.left;
			}else {
				pre = curr;
				curr = curr.right;
			}
		}
		
		if(pre.value < val) {
			pre.right = new TreeNode(val);
			return pre.right;
		}else {
			pre.left = new TreeNode(val);
			return pre.left;
		}
	}
	public static TreeNode insertRecursion(TreeNode root, int val) {
		//返回插入后的树的根节点
		if(root == null) {
			return new TreeNode(val);
		}
		
		if(root.value < val) {
			root.right = insertRecursion(root.right, val);
		}else {
			root.left = insertRecursion(root.left, val);
		}
		return root;
	}
	
	public static TreeNode searchIterative(TreeNode root, int val) {
		while(root != null) {
			if(root.value == val) {
				return root;
			}else if(root.value > val) {
				root = root.left;
			}else {
				root = root.right;
			}
		}
		return null;	
	}
	public static TreeNode searchRecursion(TreeNode root, int val) {
		if(root == null) {
			return null;
		}
		if(root.value == val) {
			return root;
		}
		
		if(root.value > val) {
			return searchRecursion(root.left, val);
		}else {
			return searchRecursion(root.right, val);
		}
		
	}

}
