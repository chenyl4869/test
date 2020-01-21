package lai;

import tools.ListNode;

public class ImplementStackWithoutDummy {
	ListNode head;
	public Integer push(int value) {
		if(head==null) {
			head = new ListNode(value);
			return value;
		}
		ListNode temp = new ListNode(value);
		temp.next = head;
		head = temp;
		return value;
		
	}
	
	public Integer pop() {
		if(head==null) {
			return null;
		}
		ListNode temp = head;
		head = head.next;
		return temp.val;
	}
	public Integer peek() {
		if(head==null) {
			return null;
		}
		return head.val;
	}
}
