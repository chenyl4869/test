package lai;

import tools.TreeNode;

public class BinaryTree_getHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//TIME O(n), SPACE O(height) = worst case O(n)
	public int getHeight(TreeNode root) {
		if(root==null) {
			return 0;
		}
		int left = getHeight(root.left);
		int right = getHeight(root.right);
		
		if(left < right) {
			return right+1;
		}else {
			return left+1;
		}
	}
	//TIME O(nlogn)
	public boolean isBalanced(TreeNode root) {
		if(root == null) {
			return true;
		}
		
		int left = getHeight(root.left);
		int right = getHeight(root.right);
		if(Math.abs(left-right)>1) {
			return false;
		}

		return isBalanced(root.left) && isBalanced(root.right);
	}
}
