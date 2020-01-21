package z3;

import tools.ListNode;

public class LinkedList_FindMiddle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static ListNode find(ListNode head) {
		if(head == null) {
			return head;
		}
		ListNode slow = head;
		ListNode fast = head;
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

}
