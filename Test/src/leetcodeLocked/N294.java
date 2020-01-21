package leetcodeLocked;

import java.util.HashMap;
import java.util.Map;

public class N294 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(canWin("++++"));
	}
	public static boolean canWin(String s) {
		if(s == null || s.length() == 0) {
			return false;
		}
		Map<String, Boolean> memo = new HashMap<>();
		char[] ss = s.toCharArray();
		return helper(ss, memo);
	}
	public static boolean helper(char[] ss, Map<String, Boolean> memo) {
		String str = String.valueOf(ss);
		if(memo.containsKey(str)) {
			return memo.get(str);
		}
		
		for(int i = 1; i < ss.length; i++) {
			if(ss[i] == '+' && ss[i-1] == '+') {
				ss[i] = '-';
				ss[i-1] = '-';
				boolean temp = !helper(ss, memo);
				ss[i-1] = '+';
				ss[i] = '+';
				if(temp == true) {
					String str2 = String.valueOf(ss);
					memo.put(str2, true);
					return true;
				}
				
			}
		}
		memo.put(str, false);
		return false;
	}

}
