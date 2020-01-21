package z3;

import tools.ListNode;

public class LinkedList_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static ListNode reverseRecursion(ListNode head) {
		if(head == null || head.next == null) {
			return head;
		}
		
		ListNode newHead = reverseRecursion(head.next);
		head.next.next = head;
		head.next = null;
		return newHead;
	}
	public static ListNode reverseIterative(ListNode head) {
		ListNode pre = null;
		ListNode curr = head;
		while(curr != null) {
			ListNode n = curr.next;
			curr.next = pre;
			pre = curr;
			curr = n;
		}
		return pre;
	}

}
