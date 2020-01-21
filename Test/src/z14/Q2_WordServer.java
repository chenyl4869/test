package z14;

import java.util.ArrayList;
import java.util.Currency;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q2_WordServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("bob");
		list.add("cat");
		list.add("rob");
		list.add("a");
		System.out.println(solution("abbcatroba", list));
	}
	public static boolean solution(String x, List<String> list) {
		if(x.length() == 0) {
			return true;
		}
		if(list.size() == 0) {
			return false;
		}
		Set<String> set = new HashSet<>();
		for(String temp : list) {
			set.add(temp);
		}
		
		boolean[] dp = new boolean[x.length()];
		String first = x.substring(0, 1);
		if(set.contains(first)) {
			dp[0] = true;
		}else {
			dp[0] = false;
		}
		
		for(int i = 1; i < x.length(); i++) {
			int last = i+1;
			String whole = x.substring(0, last);
			if(set.contains(whole)) {
				dp[i] = true;
				continue;
			}
			dp[i] = false;
			for(int cut = 1; cut < last; cut++) {
				String left = x.substring(0, cut);
				String right = x.substring(cut, last);
				boolean res = dp[cut-1] && set.contains(right);
				if(res == true) {
					dp[i] = true;
					break;
				}
			}
		}
		return dp[x.length()-1];
	}

}
