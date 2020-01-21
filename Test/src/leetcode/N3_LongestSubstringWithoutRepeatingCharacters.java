package leetcode;

import java.util.HashSet;

public class N3_LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int getMax(String s) {
		int max = 0;
		int left = 0;
		int right = 0;
		HashSet<Character> set = new HashSet<>();
		while(right < s.length()) {
			if(!set.contains(s.charAt(right))) {
				
				set.add(s.charAt(right));
				
				right ++;
				max = Math.max(max, right-left);//每次都更新, 用于处理只有一个字符 比如"a" "b" " "这种，不能写在else里面
			}else {
				
				set.remove(s.charAt(left));
				left++;
				
			}
		}
		return max;
	}

}
