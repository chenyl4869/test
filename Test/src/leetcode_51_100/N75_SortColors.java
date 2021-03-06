package leetcode_51_100;

public class N75_SortColors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0) {
        	return;
        }
        int i = 0;
        int j = 0;
        int k = nums.length-1;
        while(j != k) {
        	if(nums[j] == 0) {
        		swap(nums, i, j);
        		i++;
        		j++;
        	}else if(nums[j] == 1) {
        		j++;
        	}else {
        		swap(nums, j, k);
        		k--;
        	}
        }
    }
	public void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

}
