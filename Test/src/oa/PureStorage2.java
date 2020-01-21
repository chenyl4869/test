package oa;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class PureStorage2 {
	
	public static void main(String[] args) {
		String[] input = {"ACQUIRE 364","ACQUIRE 84","RELEASE 84","RELEASE 364"};
		String[] input2 = {"ACQUIRE 123","ACQUIRE 364","ACQUIRE 84","RELEASE 84","RELEASE 364","ACQUIRE 456"};
		System.out.println(solution(input));
	}
	public static int solution(String[] input) {
		if(input == null || input.length == 0) {
			return 0;
		}
		Set<String> set = new HashSet<>();
		Deque<String> stack = new LinkedList<>();
		for(int i = 0; i < input.length; i++) {
			String curr = input[i];
			String first = curr.substring(0, 7);
			String second = curr.substring(8, curr.length());
			if(first.equals("ACQUIRE")) {
				if(set.contains(second)) {
					return i+1;
				}else {
					set.add(second);
					stack.offerFirst(second);
				}
			}else {
				if(stack.isEmpty()) {
					return i+1;
				}
				if(!stack.peekFirst().equals(second)) {
					return i+1;
				}else {
					stack.pollFirst();
					set.remove(second);
				}
			}
		}
		if(!stack.isEmpty()) {
			return input.length+1;
		}
		return 0;
	}
}
