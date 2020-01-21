package dp;

import java.util.Arrays;

public class LongestAscendingSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] in = {7,2,3,1,5,8,9,6};
		System.out.println(get(in));
	}
	
	public static int get(int[] input) {
		if(input == null || input.length == 0) {
			return 0;
		}
		int[] dp = new int[input.length];
		dp[0] = 1;
		for(int i = 1; i < input.length;i++) {
			if(input[i-1] < input[i]) {
				dp[i] = dp[i-1] + 1;
			}else {
				dp[i] = 1;
			}
		}
		int max = 0;
		for(int i = 0; i < dp.length; i++) {
			max = Math.max(dp[i], max);
		}
		return max;
	}

}
