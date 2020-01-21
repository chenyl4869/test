package z3;

import tools.ListNode;

public class PartitionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static ListNode partition(ListNode head, int target) {
		if(head == null) {
			return head;
		}
		ListNode dummy1 = new ListNode(-1);
		ListNode dummy2 = new ListNode(-1);
		ListNode temp1 = dummy1;
		ListNode temp2 = dummy2;
		while(head != null) {
			int temp = head.val;
			if(temp < target) {
				temp1.next = head;
				head = head.next;
				temp1 = temp1.next;
			}else {
				temp2.next = head;
				head = head.next;
				temp2 = temp2.next;
			}
		}
		temp1.next = dummy2.next;
		dummy2.next = null;
		temp2.next = null;
		return dummy1.next;
	}

}
