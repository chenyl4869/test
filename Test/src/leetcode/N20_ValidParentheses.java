package leetcode;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class N20_ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		N20_ValidParentheses n20 = new N20_ValidParentheses();
		System.out.println(n20.isValid(")"));
	}
	public boolean isValid(String s) {
		Map<Character,Character> map = new HashMap<>();
		map.put('[', ']');
		map.put('{', '}');
		map.put('(', ')');
        if(s==null || s.length()==0) {
        	return true;
        }
        Deque<Character> stack = new LinkedList<>();
        for(int i=0;i<s.length();i++) {
        	char x = s.charAt(i);
        	if(map.containsKey(x)) {
        		stack.offerFirst(x);
        	}else {
        		if(stack.isEmpty()) {
        			return false;
        		}else if(map.get(stack.peekFirst())!=x) {        			
            		return false;
            	}else {
            		stack.removeFirst();
            	}
        	}
        	
        }
        
        return stack.isEmpty();
    }

}
