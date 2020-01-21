package z2;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		int[] memo = new int[n+1];
		System.out.println(fiboWithMemoization(n, memo));
		System.out.println(fiboWithDP(n));

	}
	public static int fiboWithMemoization(int n, int[] memo) {
		if(memo[n] != 0) {
			return memo[n];
		}
		if(n == 1 || n == 2) {
			return 1;
		}
		
		int res = fiboWithMemoization(n-1, memo) + fiboWithMemoization(n-2, memo);
		memo[n] = res;
		return res;
	}
	
	public static int fiboWithDP(int n) {
		int[] dp = new int[n+1];
		dp[1] = 1;
		dp[2] = 1;
		for(int i = 3; i <= n ; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		return dp[n];
	}

}
