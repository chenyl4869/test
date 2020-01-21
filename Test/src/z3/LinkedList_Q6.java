package z3;

import tools.ListNode;

public class LinkedList_Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static ListNode get(ListNode head) {
		if(head == null) {
			return head;
		}
		ListNode mid = getMiddle(head);
		ListNode node2 = mid.next;
		mid.next = null;
		ListNode head2 = reverse(node2);
		ListNode res = merge(head, head2);
		return res;
	}
	public static ListNode getMiddle(ListNode head) {
		ListNode fast = head;
		ListNode slow = head;
		while(fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}
	public static ListNode reverse(ListNode head) {
		ListNode pre = null;
		ListNode curr = head;
		while(curr != null) {
			ListNode node = curr.next;
			curr.next = pre;
			pre = curr;
			curr = node;
			node = node.next;
		}
		return pre;
	}
	public static ListNode merge(ListNode n1, ListNode n2) {
		ListNode dummy = new ListNode(-1);
		ListNode temp = dummy;
		while(n1 != null && n2 != null) {
			temp.next = n1;
			temp.next.next = n2;
			temp = temp.next.next;
			n1 = n1.next;
			n2 = n2.next;
		}
		if(n1 != null) {
			temp.next = n1;
		}
		if(n2 != null) {
			temp.next = n2;
		}
		return dummy.next;
	}
}
