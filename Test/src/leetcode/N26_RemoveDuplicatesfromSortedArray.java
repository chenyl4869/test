package leetcode;

public class N26_RemoveDuplicatesfromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int removeDuplicates(int[] nums) {
		if(nums==null || nums.length<2) {
			return nums.length;
		}

		int i = 1;
		int j = 1;
		while(j<nums.length) {
			if(nums[j]==nums[j-1]) {
				j++;
			}else {
				nums[i] = nums[j];
				i++;
				j++;
			}
			
		}
		return i;
     
    }

}
