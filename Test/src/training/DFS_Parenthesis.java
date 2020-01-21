package training;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DFS_Parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> res = new ArrayList<>();
		DFS(3, "", 0, 0, res);
		Iterator<String> iter = res.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	public static void DFS(int n, String temp, int left, int right, List<String> res) {
		if(left+right == 2*n) {
			res.add(temp);
			return;
		}
		if(left<n) {
			String next = temp+"(";
			DFS(n, next, left+1, right, res);
		}
		if(left>right) {
			String next = temp+")";
			DFS(n, next, left, right+1, res);
		}
		
	}

}
