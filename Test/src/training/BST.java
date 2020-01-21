package training;

import apple.laf.JRSUIUtils.Tree;
import tools.TreeNode;

public class BST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public TreeNode search_Recursive(TreeNode root, int value) {
		if(root == null) {
			return null;
		}
		if(root.value == value) {
			return root;
		}else if(root.value < value) {
			return search_Recursive(root.right, value);
		}else {
			return search_Recursive(root.left, value);
		}
	}
	public TreeNode search_Iterative(TreeNode root, int value) {
		while(root != null) {
			if(root.value == value) {
				return root;
			}else if(root.value > value) {
				root = root.left;
			}else {
				root = root.right;
			}
		}
		return null;
	}
	
	public TreeNode insert_Recursive(TreeNode root, int value) {
		if(root == null) {
			root = new TreeNode(value);
			return root;
		}
		if(root.value > value) {
			root.left = insert_Recursive(root.left, value);
			return root;
		}else {
			root.right = insert_Recursive(root.right, value);
			return root;
		}
	}
	
	public TreeNode insert_Iterative(TreeNode root, int value) {
		if(root == null) {
			root = new TreeNode(value);
			return root;
		}
		TreeNode pre = null;
		while(root != null) {
			if(root.value > value) {
				pre = root;
				root = root.left;
			}else {
				pre = root;
				root = root.right;
			}
		}
		if(pre.value>value) {
			pre.left = new TreeNode(value);
			return pre.left;
		}else {
			pre.right = new TreeNode(value);
			return pre.right;
		}
		
	}
	
	public TreeNode remove_Recursive(TreeNode root, int value) {
		if(root == null) {
			return null;
		}
		if(root.value > value) {
			root.left = remove_Recursive(root.left, value);
			return root;
		}else if(root.value < value) {
			root.right = remove_Recursive(root.right, value);
			return root;
		}
		// root.value == value
		if(root.right == null) {
			return root.left;
		}else if(root.left == null) {
			return root.right;
		}
		
		if(root.right.left == null) {
			root.right.left = root.left;
			return root.right;
		}else {
			TreeNode small = deleteSmallest(root.right);
			small.left = root.left;
			small.right = root.right;
			return small;
		}
		
		
	}
	public TreeNode deleteSmallest(TreeNode root) {
		TreeNode pre = root;
		root = root.left;
		while(root.left!=null) {
			pre = root;
			root = root.left;
		}
		pre.left = root.right;
		return root;
	}

}
