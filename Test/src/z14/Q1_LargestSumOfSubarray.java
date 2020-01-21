package z14;

import java.util.Arrays;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

public class Q1_LargestSumOfSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 2, 4, -1, -2, 8};
		System.out.println(followUp1(nums));
		System.out.println(Arrays.toString(followUp2(nums)));
	}
	public static int solution(int[] nums) {
		if(nums == null || nums.length == 0) {
			return 0;
		}
		int n = nums.length;
		int[] dp = new int[n];
		dp[0] = nums[0];
		int globalMax = dp[0];
		
		for(int i = 1; i < n; i++) {
			if(dp[i-1] <= 0) {
				dp[i] = nums[i];
			}else {
				dp[i] = dp[i-1] + nums[i];
			}
			if(dp[i] > globalMax) {
				globalMax = dp[i];
			}
		}
		return globalMax;
	}
	
	//用O(1)的空间 
	public static int followUp1(int[] nums) {
		if(nums == null || nums.length == 0) {
			return 0;
		}
		int n = nums.length;
		int pre = nums[0];
		int globalMax = pre;
		
		for(int i = 1; i < n; i++) {
			int temp = 0;
			if(pre <= 0) {
				temp = nums[i];
			}else {
				temp = pre + nums[i];
			}
			if(temp > globalMax) {
				globalMax = temp;
			}
			pre = temp;
		}
		return pre;
	}
	//返回最大sum, 起始位置，结束位置
	public static int[] followUp2(int[] nums) {
		int start = 0;
		int end = 0;
		int solu_start = 0;
		int solu_end = 0;
		int globalMax = 0;
		//When to update all the variables above?
		int pre = nums[0];
		globalMax = pre;
		
		int[] res = new int[3];
		res[0] = globalMax;
		res[1] = solu_start;
		res[2] = solu_end;
		if(nums == null || nums.length == 0) {
			return res;
		}
		end++;
		for(int i = 1; i < nums.length; i++) {
			int temp = 0;
			if(pre <= 0) {
				start = i;
				temp = nums[i];
			}else {
				temp = pre + nums[i];
			}
			
			if(temp >= globalMax) {
				globalMax = temp;
				solu_start = start;
				solu_end = end;
			}
			pre = temp;
			end++;
		}
		res[0] = globalMax;
		res[1] = solu_start;
		res[2] = solu_end;
		return res;
	}

}
