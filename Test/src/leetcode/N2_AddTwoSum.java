package leetcode;

import lai.Node;

public class N2_AddTwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public Node addTwoSum(Node n1, Node n2) {
		Node dummy = new Node(-1);
		Node temp = dummy;
		int c = 0;
		while(n1 != null || n2 != null) {
			int a, b;
			if(n1 == null) {
				a = 0;
			}else {
				a = n1.value;
			}
			if(n2 == null) {
				b = 0;
			}else {
				b = n2.value;
			}
			int sum = a + b + c;
			int digit = sum%10;
			c = sum/10;
			Node newNode = new Node(digit);
			newNode.next = null;
			temp.next = newNode;
			temp= temp.next;
			if(n1 != null) {
				n1 = n1.next;
			}
			if(n2 != null) {
				n2 = n2.next;
			}
		}
		if(c == 0) {
			return dummy.next;
		}else {
			temp.next = new Node(c);
			temp.next.next = null;
			return dummy.next;
		}
		
	}

}
