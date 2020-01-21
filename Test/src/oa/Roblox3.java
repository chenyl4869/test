package oa;

import java.util.HashSet;
import java.util.Set;

public class Roblox3 {
// sub - Palindrome
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(subPalindrome("aabaa"));
	}
	public static int subPalindrome(String s){
		int n = s.length();
		boolean[][] dp = new boolean[n][n];
		for(int i = 0; i < n; i++) {
			dp[i][i] = true;
		}
		for(int i = 0; i < n - 1; i++) {
			if(s.charAt(i) == s.charAt(i + 1)) {
				dp[i][i+1] = true;
			}else {
				dp[i][i + 1] = false;
			}
		}
		
		for(int len = 2; len < n; len++) {
			for(int i = 0; i < n - len; i++) {
				int j = i + len;
				if(dp[i + 1][j - 1] == true && s.charAt(i) == s.charAt(j)) {
					dp[i][j] = true;
				}else {
					dp[i][j] = false;
				}
			}
		}
		Set<String> set = new HashSet<>();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(dp[i][j] == true) {
					System.out.println("i="+i+",j="+j);
					set.add(s.substring(i, j+1));
				}
			}
		}
		return set.size();
		
	}

}
