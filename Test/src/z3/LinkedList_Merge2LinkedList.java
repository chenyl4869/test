package z3;

import tools.ListNode;

public class LinkedList_Merge2LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static ListNode merge(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(-1);
		ListNode temp = dummy;
		while(l1 != null && l2 != null) {
			if(l1.val < l2.val) {
				temp.next = l1;
				l1 = l1.next;
				temp = temp.next;
			}else {
				temp.next = l2;
				l2 = l2.next;
				temp = temp.next;
			}
		}
		while(l1 != null) {
			temp.next = l1;
			l1 = l1.next;
			temp = temp.next;
		}
		while(l2 != null) {
			temp.next = l2;
			l2 = l2.next;
			temp = temp.next;
		}
		return dummy.next;
	}

}
