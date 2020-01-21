package z3;

import java.util.Deque;
import java.util.LinkedList;

public class GetMinInTheStack2 {
	
	
	public static void main(String[] args) {
		StackWithMinClass2 s2 = new StackWithMinClass2();
		s2.push(2);
		System.out.println(s2.getMin());
		s2.push(2);
		s2.push(2);
		s2.push(2);
		System.out.println(s2.getMin());
		s2.push(1);
		System.out.println(s2.getMin());
		System.out.println(s2.pop());
		System.out.println(s2.getMin());
		System.out.println(s2.pop());
		System.out.println(s2.getMin());
		System.out.println(s2.pop());
		System.out.println(s2.pop());
		System.out.println(s2.pop());
		System.out.println(s2.getMin());
		System.out.println(s2.pop());
	}
}
