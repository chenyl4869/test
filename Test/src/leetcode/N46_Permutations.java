package leetcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class N46_Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permute(new int[] {1,2,3});
	}
	public static List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();
		if(nums==null || nums.length==0) {
			return res;
		}
        List<Integer> temp = new ArrayList<>();
		DFS(nums, temp, res, 0);
		return res;
    }
	public static void DFS(int[] nums, List<Integer> temp, List<List<Integer>> res, int level) {
		if(level == nums.length) {
			List<Integer> x = new ArrayList<>(temp); 
			res.add(x);
			return;
		}
		
		for(int i = level;i<nums.length;i++) {
			swap(nums,i,level);
			temp.add(nums[level]);
			DFS(nums, temp, res, level+1);
			temp.remove(temp.size()-1);
			swap(nums, i,level); 
		}
	}
	public static void swap(int[] nums, int a, int b) {
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}
}
