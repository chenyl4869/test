package z14;

public class Q3_EditDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "asdf";
		String s2 = "sghj";
		System.out.println(solu_recursion(s1, s2));
		System.out.println(solu_DP(s1, s2));
	}
	public static int solu_recursion(String s1, String s2) {
		return recursionHelper(s1, s2, 0, 0);
	}
	public static int recursionHelper(String s1, String s2, int i, int j) {
		if(i >= s1.length()) {
			return s2.length()-j;
		}
		if(j >= s2.length()) {
			return s1.length()-i;
		}
		if(s1.charAt(i) == s2.charAt(j)) {
			return recursionHelper(s1, s2, i+1, j+1);
		}
		
		int a = 1 + recursionHelper(s1, s2, i+1, j+1);
		int b = 1 + recursionHelper(s1, s2, i+1, j);
		int c = 1 + recursionHelper(s1, s2, i, j+1);
		
		int res = Math.min(a, Math.min(b, c));
		
		return res;
	}
	public static int solu_DP(String s1, String s2) {
		int[][] dp = new int[s1.length()+1][s2.length()+1];
		int m = s1.length() + 1;
		int n = s2.length() + 1;
		
		//base case
		for(int i = 0; i < m; i++) {
			dp[i][0] = i;
		}
		for(int j = 0; j < n; j++) {
			dp[0][j] = j;
		}
		
		//Induction Rule
		for(int i = 1; i < m; i++) {
			for(int j = 1; j < n; j++) {
				if(s1.charAt(i-1) == s2.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1];
				}else {
					int a = dp[i-1][j-1] + 1;
					int b = dp[i-1][j] + 1;
					int c = dp[i][j-1] + 1;
					dp[i][j] = Math.min(a, Math.min(b, c));
				}
			}
		}
		
		return dp[m-1][n-1];
	}
	

}
