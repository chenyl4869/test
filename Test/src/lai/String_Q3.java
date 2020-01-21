package lai;

import java.util.ArrayList;
import java.util.List;

public class String_Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(get("hello", "ll"));
		List<int[]> x = new ArrayList<>();
	}
	public static int get(String s1, String s2) {
		if(s2.length() == 0) {
			return -1;
		}
		if(s1.length() < s2.length()) {
			return -1;
		}
		int i = 0;
		while(i <= s1.length() - s2.length()) {
			if(s1.charAt(i) == s2.charAt(0)) {
				int j = 0;
				while(j < s2.length()) {
					if(s1.charAt(i+j) != s2.charAt(j)) {
						break;
					}
					j++;
				}
				if(j == s2.length()) {
					return i;
				}
			}
			i++;
		}
		return -1;
	}

}
