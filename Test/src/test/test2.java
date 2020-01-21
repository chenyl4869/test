package test;

import jdk.nashorn.internal.runtime.arrays.NumericElements;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {100, 2, 255, 3};
		//int y = remove(nums);
		int x = solution(nums);
		System.out.println(x);
	}
	public static int solution(int[] nums) {
		if(nums == null || nums.length == 0) {
			return 0;
		}
		if(nums.length == 1) {
			return 1;
		}
		int i = 0;
		int j = 0;
		while(j < nums.length) {
			if(nums[j] != 255) {
				nums[i] = nums[j];
				i++;
				j++;
			}else {
				if(j + 1 >= nums.length) {
					nums[i] = nums[j];
					i++;
					j++;
				}else if(nums[j + 1] == 255) {
					while(j < nums.length && nums[j] == 255) {
						j++;
					}
					nums[i] = 255;
					i++;
				}else{
					j = j + 2;
				}
			}
		}
		return i;
	}
	public static int remove(int[] nums) {
		int i = 0;
		int j = 0;
		while(j < nums.length) {
			if(nums[j] != 255) {
				nums[i] = nums[j];
				i++;
				j++;
			}else {
				nums[i] = nums[j];
				i++;
				j++;
				while(j < nums.length && nums[j] == 255) {
					j++;
				}
			}
		}
		return i;
	}

}
