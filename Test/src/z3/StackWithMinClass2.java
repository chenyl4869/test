package z3;

import java.util.Deque;
import java.util.LinkedList;

public class StackWithMinClass2 {
	private Deque<Integer> stack;
	private Deque<int[]> stack2;
	
	public StackWithMinClass2() {
		// TODO Auto-generated constructor stub
		stack = new LinkedList<>();
		stack2 = new LinkedList<>();
	}
	public int push(int x) {
		if(stack.isEmpty()) {
			stack.offerFirst(x);
			int[] temp = new int[2];
			temp[0] = x;
			temp[1] = stack.size();
			
			stack2.offerFirst(temp);
			
			
			
		}else {
			stack.offerFirst(x);
			int min = stack2.peekFirst()[0];
			if(x < min) {
				int[] temp = new int[2];
				temp[0] = x;
				temp[1] = stack.size();
				stack2.offerFirst(temp);
			}
			
		}
		return x;
	}
	public Integer pop() {
		if(stack.isEmpty()) {
			return null;
		}
		int res = stack.peekFirst();
		if(stack.size() == stack2.peekFirst()[1]) {
			stack.pollFirst();
			stack2.pollFirst();
		}else {
			stack.pollFirst();
		}
		return res;
	}
	public Integer getMin() {
		if(stack.isEmpty()) {
			return null;
		}
		return stack2.peekFirst()[0];
	}
}
