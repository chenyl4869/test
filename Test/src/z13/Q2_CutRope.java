package z13;

public class Q2_CutRope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//左大段 右小段
	public static int solution(int n) {
		int[] dp = new int[n+1];
		dp[1] = 1;
		for(int i = 2; i <= n; i++) {
			int max = 0;
			for(int j = 1; j < i; j++) {
				max = Math.max(Math.max(dp[j], j) * (i - j), max);
			}
			dp[i] = max;
		}
		return dp[n];
	}

}
