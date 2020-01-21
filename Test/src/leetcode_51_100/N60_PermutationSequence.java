package leetcode_51_100;

import java.util.ArrayList;
import java.util.List;

public class N60_PermutationSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getPermutation(4, 17);
	}
	public static String getPermutation(int n, int k) {
        if(n < 1 || k < 1 ) {
        	return "";
        }
        int[] fac = new int[n+1];
        fac[0] = 1;
        for(int i = 1; i <= n; i++) {
        	fac[i] = fac[i-1] * i;
        }
        if(k > fac[n]) {
        	return "";
        }
        List<Integer> nums = new ArrayList<>();
        for(int i=0;i<n;i++) {
        	nums.add(i+1);
        }
        k--;
        int[] res = new int[n];
        for(int i = 0; i < n; i++) {
        	res[i] = nums.remove(k / fac[n - 1 - i]) ;
        	k = k%fac[n-1-i];
        }
        String resString = "";
        for(int i = 0;i < n;i++) {
        	resString += res[i];
        }
        return resString;
        
        
    }
	
}
