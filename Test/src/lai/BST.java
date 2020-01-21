package lai;

import apple.laf.JRSUIUtils.Tree;
import tools.TreeNode;

public class BST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public TreeNode searchByIterative(TreeNode root,int value){
		while(root!=null) {
			if(root.value==value) {
				return root;
			}else if(root.value>value) {
				root = root.left;
			}else {
				root = root.right;
			}
		}
		return null;
	}
	public TreeNode searchByRecursive(TreeNode root,int value) {
		if(root==null) {
			return null;
		}
		if(root.value==value) {
			return root;
		}
		
		if(root.value>value) {
			return searchByRecursive(root.left, value);
		}else {
			return searchByRecursive(root.right, value);
		}
	}
	public TreeNode insertByRecursive(TreeNode root, int value) {
		if(root==null) {
			return new TreeNode(value);
		}
		if(root.value>value) {
			if(root.left==null) {
				root.left = new TreeNode(value);
				return root.left;
			}
			return insertByRecursive(root.left, value);
		}else {
			if(root.right==null) {
				root.right = new TreeNode(value);
				return root.right;
			}
			return insertByRecursive(root.right, value);
		}
		
	}
	
	public void insertByIterative(TreeNode root, int value) {
		if(root==null) {
			root = new TreeNode(value);
		}
		while(true) {
			if(root.value == value) {
				break;
			}else if(root.value>value) {
				if(root.left==null) {
					root.left = new TreeNode(value);
					break;
				}else {
					root = root.left;
				}
			}else {
				if(root.right == null) {
					root.right = new TreeNode(value);
					break; 
				}else {
					root = root.right;
				}
			}
		}
		
		
	}
}
