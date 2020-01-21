package lai;

import tools.ListNode;
//自己用linkedlist实现stack
public class ImplementStack {
	ListNode head;
	public ImplementStack() {
		head = new ListNode(0);
	}
	public void push(int value) {
		ListNode newNode = new ListNode(value);
		newNode.next = head.next;
		head.next = newNode;
	}
	public Integer pop() {
		if(head.next==null) {
			return null;
		}
		ListNode temp = head.next;
		head.next = head.next.next;
		return temp.val;
	}
	public Integer peek() {
		if(head.next==null) {
			return null;
		}
		return head.next.val;
	}
}
