package lai;

public class LinkedlistReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public Node linkedListReverse(Node n) {
		if(n == null || n.next == null) {
			return n;
		}
		
		Node newNode = linkedListReverse(n.next);
		n.next.next = n;
		n.next = null;
		return newNode;
	}

}
