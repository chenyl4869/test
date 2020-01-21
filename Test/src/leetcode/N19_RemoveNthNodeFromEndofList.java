package leetcode;

import tools.ListNode;

public class N19_RemoveNthNodeFromEndofList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if(head == null) {
			return null;
		}
        int count = 0;
        ListNode temp2 = head;
        for(int i=0;i<n;i++) {
        	temp2 = temp2.next;
        	if(temp2==null) {
        		return head.next;
        	}
        }
        ListNode pre = head;
        temp2=temp2.next;
        while(temp2!=null) {
        	pre = pre.next;
        	temp2 = temp2.next;
        }
        pre.next = pre.next.next;
        return head;
    }
}
