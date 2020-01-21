package leetcode;

import java.util.ArrayList;
import java.util.List;

public class N39_CombinationSum {
//没有重复数字，每个元素可以用多次
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		N39_CombinationSum n39 = new N39_CombinationSum();
		int[] candidates = {2,3,6,7};
		n39.combinationSum(candidates, 7);
	}
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> res = new ArrayList<>();
		if(candidates==null || candidates.length==0) {
			return res;
		}
		List<Integer> curr = new ArrayList<>();
        recursion(target, candidates, res, curr, 0,0);
        return res;
    }
	public void recursion(int target, int[] can, List<List<Integer>> res, List<Integer> curr, int sum, int start) {
//		System.out.println("sum="+sum+" curr="+curr+" start="+start);
		if(sum>target) {
			return;
		}
		if(sum==target) {
			List<Integer> tempRes= new ArrayList<>(curr);
			res.add(tempRes);
			return;
		}
		for(int i=start;i<can.length;i++) {
			curr.add(can[i]);
			recursion(target, can, res, curr, sum+can[i],i);
			curr.remove(curr.size()-1);
		}
	}

}
