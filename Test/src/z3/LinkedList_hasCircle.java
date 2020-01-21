package z3;

import tools.ListNode;

public class LinkedList_hasCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean hasC(ListNode head) {
		if(head == null) {
			return false;
		}
		ListNode fast = head;
		ListNode slow = head;
		while(fast.next != null && fast.next.next!= null) {
			slow = slow.next;
			fast = fast.next.next;
			if(fast == slow) {
				return true;
			}
		}
		return false;
	}

}
