package z2;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch_ClosestKElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,4,10,20,100,200,500,5000,50000,50001,50002};
		List<Integer> res = new ArrayList<>();
		res = get(nums, 200, 20);
		System.out.println(res.toString());
	}
	public static List<Integer> get(int[] nums, int target, int k){
		List<Integer> res = new ArrayList<>();
		
		if(nums == null || nums.length == 0 || k <= 0) {
			return res;
		}
		if(k >= nums.length) {
			for(int i = 0; i < nums.length; i++) {
				res.add(nums[i]);
			}
			return res;
		}
		int closestIndex = binarySearch(nums, target);
		res.add(nums[closestIndex]);
		int i = closestIndex - 1;
		int j = closestIndex + 1;
		k--;
		while(i >= 0 && j < nums.length && k > 0) {
			if(target - nums[i] <= nums[j] - target) {
				res.add(nums[i]);
				i--;
				k--;
			}else {
				res.add(nums[j]);
				j++;
				k--;
			}
		}
		while(i >= 0 && k > 0) {
			res.add(nums[i]);
			i--;
			k--;
		}
		while(j < nums.length && k > 0) {
			res.add(nums[j]);
			j++;
			k--;
		}
		return res;
	}
	public static int binarySearch(int[] nums, int target) {
		int left = 0;
		int right = nums.length-1;
		while(left < right - 1) {
			int mid = left + (right - left)/2;
			if(nums[mid] == target) {
				return mid;
			}else if(nums[mid] < target) {
				left = mid;
			}else {
				right = mid;
			}
		}
		if(Math.abs(nums[left] - target) < Math.abs(nums[right] - target)) {
			return left;
		}else {
			return right;
		}
	}

}
