package z14;

public class Q0_MinimumNumberOfJump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int solution(int[] nums) {
		if(nums == null || nums.length == 0) {
			return 0;
		}
		int n = nums.length;
		int[] dp = new int[n];
		dp[n-1] = 0;
		for(int i = n-2; i >= 0; i--) {
			int temp = nums[i];
			int reach = Math.min(i + temp, n-1);
			int min = Integer.MAX_VALUE;
			for(int j = i+1; j <= reach; j++) {
				min = Math.min(min, dp[j]);
			}
			if(min == Integer.MAX_VALUE) {
				dp[i] = min;
			}else {
				dp[i] = min+1;
			}
		}
		return dp[0];
	}
}
