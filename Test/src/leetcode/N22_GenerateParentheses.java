package leetcode;

import java.util.ArrayList;
import java.util.List;

public class N22_GenerateParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        String temp = "";
        helper("", n, res, 0, 0);
        return res;
    }
	//https://www.youtube.com/watch?v=PCb1Ca_j6OU
	public void helper(String temp, int n, List<String> res, int left, int right) {
		if(right == n) {
			res.add(temp);
			return;
		}
		if(left == right) {
			helper(temp+"(", n, res, left+1, right);
		}
		if(left > right) {
			if(left!=n) {
				helper(temp+"(", n, res, left+1, right);
			}
			helper(temp+")", n, res, left, right+1);
		}
	}

}
