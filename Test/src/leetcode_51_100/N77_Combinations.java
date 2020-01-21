package leetcode_51_100;

import java.util.ArrayList;
import java.util.List;

public class N77_Combinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		N77_Combinations x  = new N77_Combinations();
		x.combine(4, 2);
	}
	public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if(n == 0 || k == 0){
            return res;
        }
        List<Integer> curr = new ArrayList<>();
        DFS(n, k, curr, 1, res);
        return res;
        
    }
    public void DFS(int n, int k, List<Integer> curr, int start, List<List<Integer>> res){
    	System.out.println("start = "+start + " k = "+k);
        if(start == k + 1){
        	for(int i = 0; i< curr.size();i++) {
        		System.out.print(curr.get(i));
        	}
        	System.out.println();
            List<Integer> list = new ArrayList<>(curr);
            res.add(list);
            return;
        }
        
        for(int i = start; i <= n; i++){
        	System.out.println("i = "+i);

            curr.add(i);
            DFS(n, k, curr, start+1, res);
            curr.remove(curr.size()-1);
        }
    }

}
