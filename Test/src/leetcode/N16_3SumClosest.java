package leetcode;

import java.util.Arrays;

public class N16_3SumClosest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-4,-1,1,2};
		N16_3SumClosest n16 = new N16_3SumClosest();
		System.out.println(n16.threeSumClosest(nums, 1));
	}
	public int threeSumClosest(int[] nums, int target) {
//        if(nums==null || nums.length<3) {
//        	return 
//        }
		Arrays.sort(nums);
		int res=Integer.MAX_VALUE;
		int res2 = Math.abs(res-target);
		for(int i=0;i<nums.length;i++) {
			
			if(i>0 && nums[i]==nums[i-1]) {
				continue;
			}
			int fix = nums[i];
			//System.out.println("fix="+fix);
			int left = i+1;
			int right = nums.length-1;
			
			while(left<right) {
			//	System.out.println("left="+nums[left]);
			//	System.out.println("right="+nums[right]);
				int sum = nums[left]+nums[right]+fix;
				if(sum-target>0) {
					if(res>sum-target) {
						res = sum-target;
						res2 = sum;
					}
					right--;
//					while(left<right && nums[right]==nums[right+1]) {
//						right--;
//					}
				}else if(sum-target<0) {
					if(res>target-sum) {
						res = target-sum;
						res2 = sum;
					}
					res = Math.min(res, target-sum);
					left++;
//					while(left<right && nums[left]==nums[left-1]) {
//						left++;
//					}
				}else {
					return sum;
				}
				//System.out.println("res="+res);
			}
		}
		return res2;
    }

}
