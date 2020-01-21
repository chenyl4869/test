package dp;

public class MaxProdcutOfCuttingRope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(cut3(10));
	}
	
	//左大段右大段
	public static int cut(int x) {
		int[] dp = new int[x+1];
		dp[1] = 1;
		for(int i = 2; i <= x; i++) {
			int max = 0;
			for(int j = 1; j <= i/2; j++) {
				int left = j;
				int right = i - j;
				int temp = Math.max(left, dp[left]) * Math.max(right, dp[right]);
				max = Math.max(max, temp);
			}
			dp[i] = max;
		}
		return dp[x];
	}
	//左大段右小段
	public static int cut2(int x) {
		int[] dp = new int[x+1];
		dp[1] = 1;
		for(int i = 2; i <= x ;i++) {
			int max = 0;
			for(int j = 1; j < i; j++) {
				int left = j;
				int right = i-j;
				int temp = Math.max(left * right, dp[left] * right);
				max = Math.max(temp, max);
			}
			dp[i] = max;
		}
		return dp[x];
	}
	
	//Recursion
	public static int cut3(int x) {
		int[] memo = new int[x+1];
		return helper(x, memo);
	}
	public static int helper(int x, int[] memo) {
		if(x <= 1) {
			return 1;
		}
		if(memo[x] != 0) {
			return memo[x];
		}
		int max = 0;
		for(int i = 1; i < x; i++) {
			int left = i;
			int right = x - i;
			int temp = Math.max(left * right, helper(left, memo) * right);
			max = Math.max(max, temp);
		}
		memo[x] = max;
		return max;
	}
	

}
