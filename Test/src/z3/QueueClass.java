package z3;

import java.util.Deque;
import java.util.LinkedList;

public class QueueClass {
	private Deque<Integer> stack1;
	private Deque<Integer> stack2;
	public QueueClass() {
		stack1 = new LinkedList<>();
		stack2 = new LinkedList<>();
	}
	public int enQueue(int x) {
		stack1.offerFirst(x);
		return x;
	}
	public Integer deQueue(){
		Integer res;
		if(!stack2.isEmpty()) {
			res = stack2.pollFirst();
		}else {
			if(stack1.isEmpty()) {
				res = null;
			}else {
				while(!stack1.isEmpty()) {
					stack2.offerFirst(stack1.pollFirst());
				}
				res = stack2.pollFirst();
			}
		}
		return res;
	}
	

}
