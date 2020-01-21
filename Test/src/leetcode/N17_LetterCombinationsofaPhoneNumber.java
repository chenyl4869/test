package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class N17_LetterCombinationsofaPhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<String> letterCombinations(String digits) {
		List<String> res = new ArrayList<>();
		if(digits==null || digits.length()==0 || digits.contains("1")) {
			return res;
		}
		Map<Character, String> m = new HashMap<>();
		m.put('2', "abc");
		m.put('3', "def");
		m.put('4', "ghi");
		m.put('5', "jkl");
		m.put('6', "mno");
		m.put('7', "pqrs");
		m.put('8', "tuv");
		m.put('9', "wxyz");
		m.put('0', "");
		String temp = "";
        DFS(res, 0, temp, m,digits);
        return res;
    }
	public void DFS(List<String> res, int level, String temp, Map<Character, String> m,String digits) {
		if(level == digits.length()) {
			res.add(temp);
			return;
		}
		
		String tempString = m.get(digits.charAt(level));
		for(int i=0;i<tempString.length();i++) {
			String next = temp + tempString.charAt(i);
			DFS(res, level+1, next, m, digits);
		}
	}

}
