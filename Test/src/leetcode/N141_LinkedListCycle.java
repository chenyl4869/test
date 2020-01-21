package leetcode;

import tools.ListNode;

public class N141_LinkedListCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean hasCycle(ListNode head) {
		if(head == null) {
			return false;
		}
		ListNode t1 = head;
		ListNode t2 = head;
		while(t2.next != null && t2.next.next != null) {
			t1 = t1.next;
			t2 = t2.next.next;
			if(t1==t2) {
				return true;
			}
		}
		return false;
	}

}
