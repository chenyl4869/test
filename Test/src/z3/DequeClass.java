package z3;

import java.util.Deque;
import java.util.LinkedList;

public class DequeClass {
	private Deque<Integer> stack1;
	private Deque<Integer> stack2;
	private Deque<Integer> stack3;
	
	public DequeClass() {
		stack1 = new LinkedList<>();
		stack2 = new LinkedList<>();
		stack3 = new LinkedList<>();
	}
	
	public void offerFirst(int x) {
		stack1.offerFirst(x);
	}
	public void offerLast(int x) {
		stack2.offerFirst(x);
		
	}
	public Integer pollFirst() {
		if(!stack1.isEmpty()) {
			return stack1.pollFirst();
		}
		if(stack2.isEmpty()) {
			return null;
		}
		int half = stack2.size() / 2;
		int size = stack2.size();
		for(int i = 0; i < size; i++) {
			if(i < half) {
				stack3.offerFirst(stack2.pollFirst());
			}else{
				stack1.offerFirst(stack2.pollFirst());
			}
		}
		for(int i = 0; i < half; i++) {
			stack2.offerFirst(stack3.pollFirst());
		}
		return stack1.pollFirst();
		
	}
	public Integer pollLast() {
		if(!stack2.isEmpty()) {
			return stack2.pollFirst();
		}
		if(stack1.isEmpty()) {
//			System.out.println(111);
			return null;
		}
//		System.out.println(stack1.size());
		int half = stack1.size() / 2;
		int size = stack1.size();
		for(int i = 1; i <= size; i++) {
			if(i <= half) {
				stack3.offerFirst(stack1.pollFirst());
			}else {
				stack2.offerFirst(stack1.pollFirst());
			}
		}
		while(!stack3.isEmpty()) {
			stack1.offerFirst(stack3.pollFirst());
		}
		return stack2.pollFirst();
		
	}
	
}
