package training;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DFS_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "abc";
		List<String> res = new ArrayList<>();
		DFS(x, "", 0, res);
		Iterator<String> iterator = res.iterator();
		while(iterator.hasNext()) {
			String result = iterator.next();
			System.out.println(result);
		}
	}
	public static void DFS(String init, String temp, int level, List<String> res) {
		if(level == init.length()) {
			res.add(temp);
			return;
		}
		
		DFS(init, temp, level+1, res);
		
		String next = temp+init.charAt(level);
		DFS(init,next,level+1,res);
	}
}
