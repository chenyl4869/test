package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N18_4Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		N18_4Sum n18 = new N18_4Sum();
		int[] nums = {-5,-4,-2,-2,-2,-1,0,0,1};
		n18.fourSum(nums, -9);
	}
	public List<List<Integer>> fourSum(int[] nums, int target){
		
		Arrays.sort(nums);
		List<List<Integer>> res = new ArrayList<>();
		if(nums==null ||nums.length<4) {
			return res;
		}
		
		for(int i=0;i<nums.length;i++) {
			if(i>0 && nums[i]==nums[i-1]) {
				continue;
			}
			System.out.println("iiiiiii="+nums[i]);
			for(int j=i+1;j<nums.length;j++) {
				if(j>i+1 && nums[j]==nums[j-1]) {
					continue;
				}
				System.out.println("j="+nums[j]);
				int a = nums[i];
				int b = nums[j];
				int left = j+1;
				int right = nums.length-1;
				while(left<right) {
					System.out.println("left="+nums[left]);
					System.out.println("right="+nums[right]);
					if(a+b+nums[left]+nums[right]>target) {
						right--;
//						while(left<right && nums[right]==nums[right+1]) {
//							right--;
//						}
					}else if(a+b+nums[left]+nums[right]<target) {
						left++;
//						while(left<right && nums[left]==nums[left-1]) {
//							left++;
//						}
					}else {
						List<Integer> temp = new ArrayList<>();
						temp.add(a);
						temp.add(b);
						temp.add(nums[left]);
						temp.add(nums[right]);
						res.add(temp);
						left++;
						right--;
						while(left<right && nums[left]==nums[left-1]) {
							left++;
						}
						while(left<right && nums[right]==nums[right+1]) {
							right--;
						}
					}
				}
				
			}
		}
		return res;
	}

}
