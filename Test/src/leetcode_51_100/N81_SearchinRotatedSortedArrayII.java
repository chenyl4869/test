package leetcode_51_100;

public class N81_SearchinRotatedSortedArrayII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {1,1,3};
		System.out.println(search(x, 3));
	}
	public static boolean search(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return false;
        }
        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            int mid = left+(right-left)/2;
            
            if(nums[mid] == target){
                return true;
            }else if(nums[mid] < nums[right]){
                if(nums[mid] < target && target <= nums[right]){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }else if(nums[mid] > nums[right]){
                if(nums[left] <= target && nums[mid] > target){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }else{
                right--;
            }
        }
        return false;
    }

}
