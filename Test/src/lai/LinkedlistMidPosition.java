package lai;

public class LinkedlistMidPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int findMid(Node n1) {
		Node temp1 = n1;
		Node temp2 = n1;
		if(n1==null) {
			return -1;
		}
		while(temp2.next!=null && temp2.next.next != null) {
			temp1 = temp1.next;
			temp2 = temp2.next.next;
		}
		return temp1.value;
		
	}

}
