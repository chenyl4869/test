package leetcode;

import lai.Node;
import tools.ListNode;

public class N2_AddTwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/*
	 * 注意
	 * 1. l1,l2,cur都要移动
	 * 2. 最后要检查c，如果是1，还要增加一个节点。
	 * 
	 * */
	public ListNode addTwoSum(ListNode l1, ListNode l2) {
		int c = 0;
		ListNode dummy = new ListNode(0);
		ListNode cur = dummy;
		while(l1!=null &&l2 != null) {
			int sum = l1.val+l2.val +c;
			c = sum/10;
			int digit = sum%10;
			cur.next = new ListNode(digit);
			cur = cur.next;
			l1=l1.next;
			l2=l2.next;
		}
		while(l1 !=null) {
			int sum = l1.val+c;
			c = sum/10;
			int digit = sum%10;
			cur.next = new ListNode(digit);
			cur = cur.next;
			l1=l1.next;
		}
		while(l2 != null) {
			int sum = l2.val +c;
			c=sum/10;
			int digit = sum%10;
			cur.next = new ListNode(digit);
			cur = cur.next;
			l2=l2.next;
		}
		if(c==1) {
			cur.next = new ListNode(1);
		}
		return dummy.next;
		
	}

}
