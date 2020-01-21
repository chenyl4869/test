package z3;

import java.util.Deque;
import java.util.LinkedList;

public class StackWithMinClass {
	private Deque<Integer> stack1;
	private Deque<Integer> stack2;
	
	public StackWithMinClass() {
		// TODO Auto-generated constructor stub
		stack1 = new LinkedList<>();
		stack2 = new LinkedList<>();
	}
	
	public int push(int x) {
		int min;
		if(stack1.isEmpty()) {
			min = x;
		}else {
			min = stack2.peekFirst();
		}
		stack1.offerFirst(x);
		if(x < min) {
			stack2.offerFirst(x);
		}else {
			stack2.offerFirst(min);
		}
		return x;
		
	}
	public Integer pop() {
		if(stack1.isEmpty()) {
			return null;
		}
		int res = stack1.pollFirst();
		stack2.pollFirst();
		return res;
	}
	public Integer getMin() {
		if(stack2.isEmpty()) {
			return null;
		}
		return stack2.peekFirst();
	}
	
}
