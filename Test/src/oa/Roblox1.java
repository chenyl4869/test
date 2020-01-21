package oa;

import tools.ListNode;

public class Roblox1 {
//binary number in a LinkedList
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		ListNode temp = head;
		temp.next = new ListNode(1);
		temp = temp.next;
		temp.next = new ListNode(0);
		temp = temp.next;
		temp.next = new ListNode(0);
		temp = temp.next;
		temp.next = new ListNode(1);
		temp = temp.next;
		temp.next = new ListNode(1);
		temp = temp.next;
		
		System.out.println(getNumber(head));
	}
	public static long getNumber(ListNode head) {
		StringBuilder sb = new StringBuilder();
		int flag = 0;
		while(head != null) {
			if(flag == 0) {
				if(head.val == 0) {
					
				}else {
					flag = 1;
					sb.append(head.val);
				}
			}else {
				sb.append(head.val);
			}
			head = head.next;
		}
		String s = sb.toString();
		int count = 1;
		long res = 0;
		for(int i = s.length() - 1; i>= 0; i--) {
			char curr = s.charAt(i);
			int temp = curr - '0';
			res += temp * count;
			count *= 2;
		}
		return res;
	}

}
