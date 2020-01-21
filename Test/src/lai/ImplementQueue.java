package lai;

import tools.ListNode;

public class ImplementQueue {
	ListNode head;
	ListNode tail;
	public ImplementQueue() {
		head = null;
		tail = null;
	}
	public Integer enQueue(int value) {
		if(tail == null) {
			tail = new ListNode(value);
			head = tail;
			return value;
		}
		tail.next = new ListNode(value);
		tail = tail.next;
		return value;
		
	}
	public Integer deQueue() {
		if(head == null) {
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
