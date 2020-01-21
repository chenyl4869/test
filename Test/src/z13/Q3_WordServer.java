package z13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class Q3_WordServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("bob");
		list.add("cat");
		list.add("rob");
		list.add("a");
		System.out.println(solution("acatroba", list));
	}
	public static boolean solution(String input, List<String> dic) {
		if(input == null || input.length() == 0) {
			return false;
		}
		Set<String> set = new HashSet<>();
		buildDic(dic, set);
		int n = input.length();
		boolean[] dp = new boolean[n+1];
		String first = input.substring(0, 1);
		if(set.contains(first)) {
			dp[1] = true;
		}
		for(int i = 2; i <= n; i++) {
			if(set.contains(input.substring(0,i))) {
				dp[i] = true;
				continue;
			}
			for(int j = 1; j < i; j++) {
				boolean temp = dp[j] && set.contains(input.substring(j,i));
				if(temp) {
					dp[i] = true;
					break;
				}
			}
		}
		return dp[n];
		
	}
	public static void buildDic(List<String> dic, Set<String> set) {
		for(String temp : dic) {
			set.add(temp);
		}
	}

}
