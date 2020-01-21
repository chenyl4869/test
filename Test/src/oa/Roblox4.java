package oa;

import java.util.Arrays;

public class Roblox4 {
//Distinct Pairs
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {5, 7, 9, 13, 11, 6, 6, 3, 3};
		System.out.println(countPairs(nums, 12));
	}
	public static int countPairs(int[] nums, int k) {
		if(nums.length == 0) {
			return 0;
		}
		int res = 0;
		Arrays.sort(nums);
		int i = 0;
		int j = nums.length - 1;
		while(i < j) {
			if(nums[i] + nums[j] == k) {
				res++;
				i++;
				j--;
			}else if(nums[i] + nums[j] < k) {
				i++;
			}else {
				j--;
			}
			while(i != 0 && i < j && nums[i] == nums[i - 1]) {
				i++;
			}
			while(j < nums.length - 1 && i < j && nums[j] == nums[j + 1]) {
				j--;
			}
		}
		return res;
		
	}

}
