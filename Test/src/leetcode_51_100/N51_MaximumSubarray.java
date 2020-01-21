package leetcode_51_100;

public class N51_MaximumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) {
        	return -1;//看情况
        }
        int maxToCurr = nums[0];
        int max = nums[0];
        for(int i = 1; i<nums.length; i++) {
        	maxToCurr = Math.max(maxToCurr+nums[i], nums[i]);
        	max = Math.max(maxToCurr, max);
        }
        return max;
        
    }
}
