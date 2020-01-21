package leetcode_51_100;

import java.util.ArrayList;
import java.util.List;

public class N78_Subsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums == null || nums.length == 0){
            return res;
        }
        List<Integer> curr = new ArrayList<>();
        DFS(nums, curr, res, 0);
        return res;
        
    }
    public void DFS(int[] nums, List<Integer> curr, List<List<Integer>> res, int level){
        if(level == nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        
        DFS(nums, curr, res, level+1);
        
        curr.add(nums[level]);
        DFS(nums, curr, res, level+1);
        curr.remove(curr.size()-1);
        
    }
}
