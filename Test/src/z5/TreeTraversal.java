package z5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.table.TableModel;

import jdk.nashorn.internal.runtime.Context.ThrowErrorManager;
import tools.TreeNode;

public class TreeTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void preOrderRecursion(TreeNode root, List<Integer> list) {
		if(root == null) {
			return;
		}
		list.add(root.value);
		preOrderRecursion(root.left, list);
		preOrderRecursion(root.right, list);
	}
	public static List<Integer> preOrderIterative(TreeNode root) {
		Deque<TreeNode> stack = new LinkedList<>();
		List<Integer> res = new ArrayList<>();
		while(root != null || stack.size() != 0) {
			while(root != null) {
				res.add(root.value);
				stack.offerFirst(root.left);
				root = root.left;
			}
			TreeNode temp = stack.pollFirst();
			root = temp.right;
		}
		return res;
	}
	
	public static void inOrderRecursion(TreeNode root, List<Integer> list) {
		if(root == null) {
			return;
		}
		
		inOrderRecursion(root.left, list);
		list.add(root.value);
		inOrderRecursion(root.right, list);
		
	}
	public static List<Integer> inOrderIterative(TreeNode root) {
		Deque<TreeNode> stack = new LinkedList<>();
		List<Integer> res = new ArrayList<>();
		while(root != null || stack.size() != 0) {
			while(root != null) {
				stack.offerFirst(root);
				root = root.left;
			}
			TreeNode temp = stack.pollFirst();
			res.add(temp.value);
			root = temp.right;
		}
		return res;
	}
	
	public static void postOrderRecursion(TreeNode root, List<Integer> list){
		if(root == null) {
			return;
		}
		postOrderRecursion(root.left, list);
		postOrderRecursion(root.right, list);
		list.add(root.value);
	}
	
	public static List<Integer> postOrderIterarive(TreeNode root){
		Deque<TreeNode> stack = new LinkedList<>();
		List<Integer> res = new ArrayList<>();
		while(root != null || stack.size() != 0) {
			while(root != null) {
				res.add(root.value);
				stack.offerFirst(root);
				root = root.right;
			}
			TreeNode temp = stack.pollFirst();
			root = temp.left;
		}
		
		Collections.reverse(res);
		return res;
		
	}
	public static List<Integer> BFS(TreeNode root) {
		List<Integer> res = new ArrayList<>();
		if(root == null) {
			return res;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while(!queue.isEmpty()) {
			int size = queue.size();
			for(int i = 0; i< size; i++) {
				TreeNode temp = queue.poll();
				res.add(temp.value);
				if(temp.left != null) {
					queue.offer(temp.left);
				}
				if(temp.right != null) {
					queue.offer(temp.right);
				}
			}
		}
		return res;
	}

}
