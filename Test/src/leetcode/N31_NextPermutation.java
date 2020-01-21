package leetcode;

public class N31_NextPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3};
		nextPermutation(nums);
	}
	public static void nextPermutation(int[] nums) {
        if(nums==null||nums.length<=1) {
        	return;
        }
        int i = nums.length-1;
        i--;
        while(i>=0 && nums[i]>=nums[i+1]) { //i和i+1可不可以没有等号
        	i--;
        }
        if(i>=0) {
        	int j = nums.length-1;
        	while(nums[j]<=nums[i]) {//需不需要j>=0 或者j>i 可不可以有等号
        		j--;
        	}
        	int temp = nums[i];
        	nums[i] = nums[j];
        	nums[j] = temp;
        }
        i=i+1;
        for(int k = 0;k<(nums.length-i)/2;k++) {
        	int temp = nums[k+i];
        	nums[k+i] = nums[nums.length-1-k];
        	nums[nums.length-1-k] = temp;
        }
    }

}
