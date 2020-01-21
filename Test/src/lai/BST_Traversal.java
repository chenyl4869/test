package lai;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import sun.security.krb5.internal.crypto.crc32;
import tools.TreeNode;

public class BST_Traversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<Integer> preOrder(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		if (root == null) {
			return null;
		}
		Deque<TreeNode> stack = new LinkedList<>();
		stack.offerFirst(root);
		while (!stack.isEmpty()) {
			TreeNode cur = stack.pollFirst();
			list.add(cur.value);
			if (cur.right != null) {
				stack.offerFirst(cur.right);
			}
			if (cur.left != null) {
				stack.offerFirst(cur.left);
			}
		}
		return list;
	}

	public void inOrder(TreeNode root) {
		if (root == null) {
			return;
		}
		Deque<TreeNode> stack = new LinkedList<>();
		TreeNode helper = root;
		while (!stack.isEmpty() || helper != null) {
			if (helper != null) {
				stack.offerFirst(helper);
				helper = helper.left;
			} else {
				TreeNode cur = stack.pollFirst();
				System.out.println(cur.value);
				helper = cur.right;
			}
		}
	}
	public void postOrder(TreeNode root) {
		if(root == null) {
			return;
		}
		Deque<TreeNode> stack = new LinkedList<>();
		TreeNode pre = null;
		stack.offerFirst(root);
		while(!stack.isEmpty()) {
			TreeNode cur = stack.peekFirst();
			if(pre==null || pre.left==cur || pre.right==cur) {
				if(cur.left!=null) {
					stack.offerFirst(cur.left);
				}else if(cur.right!=null) {
					stack.offerFirst(cur.right);
				}else {
					System.out.println(cur.value);
					stack.pollFirst();
				}
			}else if(pre == cur.left) {
				if(cur.right!=null) {
					stack.offerFirst(cur.right);
				}else {
					System.out.println(cur.value);
					stack.poll();
				}
			}else{ //pre == cur.right
				System.out.println(cur.value);
				stack.poll();
				
			}
			pre = cur;
		}
	}

}
