package z13;

public class Q1_Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int fiboRecursion(int n) {
		if(n == 1 || n == 2) {
			return 1;
		}
		return fiboRecursion(n-1)+fiboRecursion(n-2);
	}
	public static int fiboRecursionMemo(int n, int[] memo) {
		if(memo[n] != 0) {
			return memo[n];
		}
		if(n == 1 || n == 2) {
			return 1;
		}
		int res = fiboRecursionMemo(n-1, memo) + fiboRecursionMemo(n-2, memo);
		memo[n] = res;
		return res;
		
	}
	public static int fiboDP(int n) {
		if(n == 1||n == 2) {
			return 1;
		}
		int[] dp = new int[n+1];
		dp[1] = 1;
		dp[2] = 1;
		for(int i = 3; i <= n; i++) {
			dp[i] = dp[i-1]+dp[i-2];
		}
		return dp[n];
	}

}
