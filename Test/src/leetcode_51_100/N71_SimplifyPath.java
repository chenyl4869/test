package leetcode_51_100;

import java.util.Deque;
import java.util.LinkedList;

public class N71_SimplifyPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String simplifyPath(String path) {
       if(path == null) {
    	   return null;
       }
       if(path.equals("")) {
    	   return "/";
       }
       Deque<String> stack = new LinkedList<>();
       String[] s = path.split("/");
       for(int i = 0; i<s.length;i++) {
    	   if(!s[i].equals("")) {
    		   if(s[i].equals("..")) {
    			   if(!stack.isEmpty()) {
    				   stack.pollFirst();
    			   }
    		   }else if(!s[i].equals(".")) {
    			   stack.offerFirst(s[i]);
    		   }
    	   }
       }
       String res = "";
       while(!stack.isEmpty()) {
    	   res = "/" + stack.pollFirst() + res;
       }
       if(res.equals("")) {
    	   return "/";
       }
       return res;
    }

}
