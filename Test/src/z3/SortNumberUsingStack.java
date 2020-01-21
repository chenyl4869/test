package z3;

import java.util.Deque;
import java.util.LinkedList;

public class SortNumberUsingStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> stack = new LinkedList<>();
		stack.offer(1);
		stack.offer(5);
		stack.offer(5);
		stack.offer(5);
		stack.offer(4);
		stack.offer(3);
		stack.offer(3);
		Deque<Integer> stack2 = sortWithDuplicateStack(stack);
		//System.out.println(stack.isEmpty());
		while(!stack2.isEmpty()) {
			System.out.println(stack2.pollFirst());
		}
	}
	public static Deque<Integer> sortNoDuplicateStack(Deque<Integer> stack) {
		Deque<Integer> stack2 = new LinkedList<>();
		while(!stack.isEmpty()) {
			int min = Integer.MAX_VALUE;
			int size = stack.size();
			for(int i = 0; i < size; i++) {
				int temp = stack.pollFirst();
				if(temp < min) {
					min = temp;
				}
				stack2.offerFirst(temp);
			}
			
			for(int i = 0; i < size; i++) {
				int temp = stack2.pollFirst();
				if(temp == min) {
					continue;
				}
				stack.offerFirst(temp);
			}
			stack2.offerFirst(min);
		}
		return stack2;
	}
	
	public static Deque<Integer> sortWithDuplicateStack(Deque<Integer> stack){
		Deque<Integer> stack2 = new LinkedList<>();
		while(!stack.isEmpty()) {
			int size = stack.size();
			int min = Integer.MAX_VALUE;
			for(int i = 0; i < size; i++) {
				int temp = stack.pollFirst();
				if(temp < min) {
					
					min = temp;
				}
				stack2.offerFirst(temp);
			}
			int count = 0;
			for(int i = 0; i < size; i++) {
				int temp = stack2.pollFirst();
				if(temp == min) {
					count++;
					continue;
				}
				stack.offerFirst(temp);
			}
			
			for(int i = 0; i < count; i++) {
				stack2.offerFirst(min);
			}
		}
		return stack2;
	}

}
