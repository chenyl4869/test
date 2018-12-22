package training;

import lai.Node;

public class Linkedlist_FindMidPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int findMidPosition(Node head) {
		Node temp1 = head;
		Node temp2 = head;
		if(head == null) {
			return head.value;
		}
		while(temp2.next != null && temp2.next.next != null) {
			temp1 = head.next;
			temp2 = head.next.next;
		}
		return temp1.value;
	}

}
