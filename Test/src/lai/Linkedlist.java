package lai;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node = new Node(1);
		Node node2 = new Node(4);
		
		node.next = node2;
		
		Node head = node;
		
		Node node3 = new Node(2);
		Node node4 = new Node(3);
		
		node3.next = node4;
		
		Linkedlist x = new Linkedlist();
		Node result = x.merge(node, node3);
		while(result!=null) {
			System.out.println(result.value);
			result = result.next;
		}
		
	}
	public Node merge(Node head1, Node head2) {
		Node resultHead = new Node(0);
		Node x = resultHead;
		while(head1!=null && head2!=null) {
			if(head1.value<head2.value) {
				x.next = head1;
				x = x.next;
				head1 = head1.next;
			}else {
				x.next = head2;
				x = x.next;
				head2 = head2.next;
			}
		}
		if(head1==null) {
			x.next = head2;
		}else if(head2==null) {
			x.next = head1;
		}
		
		return resultHead.next;
	}

}
