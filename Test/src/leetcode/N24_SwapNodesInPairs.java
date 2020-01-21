package leetcode;

import tools.ListNode;

public class N24_SwapNodesInPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public ListNode swapPairs(ListNode head) {
		if(head==null || head.next == null) {
			return head;
		}
		
		ListNode newNode = swapPairs(head.next.next);
		ListNode newHead = head.next;
		head.next = newNode;
		newHead.next = head;
		return newHead;
		
		
	}
	
	
	
	
	
	
	
	
	public ListNode swapPairs2(ListNode head) {
		if(head == null || head.next == null) {
			return head;
		}
		ListNode newNode = swapPairs(head.next.next);
		ListNode tempHead = head.next;
		head.next = newNode;
		tempHead.next = head;
		return tempHead;
		
		
	}
	
	
	

}
