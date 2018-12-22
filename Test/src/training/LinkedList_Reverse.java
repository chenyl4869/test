package training;

import lai.Node;

public class LinkedList_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public Node Reverse(Node node) {
		if(node == null || node.next == null) {
			return node;
		}
		Node newHead = Reverse(node.next);
		node.next.next = node;
		node.next = null;
		return newHead;
	}

}
