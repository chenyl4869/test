package training;

import lai.Node;

public class MergeTwoLinkedlist {
	public static void main(String[] args) {
		
	}
	public Node Merge(Node n1,Node n2) {
		Node dummy = new Node(-1);
		Node temp = dummy;
		while(n1!=null && n2 != null) {
			if(n1.value < n2.value) {
				temp.next = n1;
				temp=temp.next;
				n1=n1.next;
			}
			else {
				temp.next = n2;
				temp = temp.next;
				n2 = n2.next;
			}
		}
		if(n1 == null) {
			temp.next = n2;
		}else if(n2 == null){
			temp.next = n1;
		}
		return dummy.next;
	}
}
