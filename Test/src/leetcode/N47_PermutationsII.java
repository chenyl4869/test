package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N47_PermutationsII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permuteUnique(new int[] {1,1,2});
	}
	public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        if(nums==null || nums.length==0){
            return res;
        }
        Arrays.sort(nums);
        List<Integer> temp = new ArrayList();
        boolean[] visited = new boolean[nums.length];
        DFS(nums, temp, res, 0, visited);
        return res;
        
    }
    public static void DFS(int[] nums, List<Integer> temp, List<List<Integer>> res, int level, boolean[] visited){
        if(level == nums.length){
            List<Integer> x = new ArrayList<>(temp);
            res.add(x);
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1] && visited[i-1]==false){//这里为什么要有最后一个条件
                continue;
            }
            if(visited[i]==true){
                continue;
            }
            
            temp.add(nums[i]);
            visited[i]= true;
            DFS(nums, temp, res, level+1, visited);
            visited[i]= false;
            temp.remove(temp.size()-1);
        }
    }

}
