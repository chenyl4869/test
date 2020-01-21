package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N40_CombinationSumII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//两点不同，1.集合里本身就有重复元素。 2.不能使用同一个数字两次
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    	List<List<Integer>> res = new ArrayList<>();
    	if(candidates==null || candidates.length==0) {
    		return res;
    	}
    	List<Integer> curr = new ArrayList<>();
    	Arrays.sort(candidates);
    	DFS(target, candidates, res, curr, 0, 0);
    	return res;
    }
    public void DFS(int target, int[] can, List<List<Integer>> res, List<Integer> curr, int sum, int start) {
    	if(sum > target) {
    		return;
    	}
    	if(sum == target) {
    		res.add(new ArrayList<>(curr));
    		return;
    	}
    	for(int i=start;i<can.length;i++) {
    		if(i>start && can[i]==can[i-1]) {
    			continue;
    		}
    		curr.add(can[i]);
    		DFS(target, can, res, curr, sum+can[i], i+1);
    		curr.remove(curr.size()-1);
    	}
    }
}
