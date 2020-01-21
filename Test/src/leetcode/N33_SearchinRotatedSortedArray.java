package leetcode;


public class N33_SearchinRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int search(int[] nums, int target) {
       if(nums==null || nums.length==0) {
    	   return -1;
       }
       int left = 0;
       int right = nums.length-1;
       while(left<=right) {
    	   int mid = left+(right-left)/2;
    	   if(nums[mid]==target) {
    		   return mid;
    	   }
    	   if(nums[mid]<nums[nums.length-1]) {
    		   if(target<=nums[nums.length-1]&& target>nums[mid]) {//不可以看mid和第一个nums[0]，要看mid和最后一个的关系，【1，3】，3这个才成立
    			   
    			   left = mid+1;
    		   }else {
    			   right = mid-1;
    		   }
    	   }else {
    		   if(target<nums[mid] && target>=nums[0]) {//也可以是target > nums[num.length-1]
    			   right = mid-1;
    			   
    		   }else {
    			   left = mid+1;
    		   }
    	   }
       }
       return -1;
    }

}
