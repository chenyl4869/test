package lai;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import tools.ListNode;

public class Linkedlsit_BasicOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int length(ListNode head) {
		int length = 0;
		while(head!=null) {
			length++;
			head = head.next;
		}
		return length;
	}
	public ListNode get(ListNode head,int index) {
		while(index>0 && head!=null) {
			head = head.next;
			index--;
		}
		return head;
	}
	public ListNode appendHead(ListNode head,int value) {
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		return newNode;
	}
	public ListNode appendTail(ListNode head, int value) {
		if(head==null) {
			ListNode newNode = new ListNode(value);
			newNode.next = head;
			return newNode;
		}
		ListNode cur = head;
		while(cur.next!=null) {
			cur = cur.next;
		}
		cur.next = new ListNode(value);
		return head;
		
	}
	public ListNode deleteOneNode(ListNode head, int value) {
		if(head==null) {
			return head;
		}
		if(head.val == value) {
			return head.next;
		}
		ListNode cur = head;
		while(cur.next!=null && cur.next.val!=value) {
			cur = cur.next;
		}
		if(cur.next==null) {
			return head;
		}
		cur.next = cur.next.next;
		return head;
	}

}
