package z1;

import java.util.Deque;
import java.util.LinkedList;

public class ThreeStackSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Deque<Integer> stack = new LinkedList<>();
		stack.offer(5);
		stack.offer(1);
		stack.offer(1);
		stack.offer(1);
		stack.offer(4);
		Deque<Integer> res = sort(stack);
		while(!res.isEmpty()) {
			System.out.println(res.poll());
		}
		
	}
	public static Deque<Integer> sort(Deque<Integer> stack) {
		Deque<Integer> stack2 = new LinkedList<>();
		Deque<Integer> stack3 = new LinkedList<>();
		if(stack.size() == 0) {
			return stack3;
		}
		
		while(!stack.isEmpty()) {
			int min = Integer.MAX_VALUE;
			while(!stack.isEmpty()) {
				int temp = stack.pollFirst();
				if(min > temp) {
					min = temp;
				}
				stack2.offerFirst(temp);
			}
			stack3.offerFirst(min);
			backToStack1(stack, stack2, min);
		}
		return stack3;
	}
	public static void backToStack1(Deque<Integer> stack, Deque<Integer> stack2, int min) {
		int count = 0;
		while(!stack2.isEmpty()) {
			int temp = stack2.pollFirst();
			if(temp != min || count != 0) {
				stack.offerFirst(temp);
			}else {
				count++;
			}
		}
	}

}
