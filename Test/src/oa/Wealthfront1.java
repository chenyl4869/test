package oa;

import java.util.HashSet;
import java.util.Set;

public class Wealthfront1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("10:10:00", "10:10:04"));
	}
	public static int solution(String S, String T) {
		int h1 = Integer.parseInt(S.substring(0, 2));
		int h2 = Integer.parseInt(T.substring(0,2));
		
		int m1 = Integer.parseInt(S.substring(3, 5));
		int m2 = Integer.parseInt(T.substring(3, 5));
		
		int s1 = Integer.parseInt(S.substring(6, 8));
		int s2 = Integer.parseInt(T.substring(6, 8));
		int res = 0;
		while(h1 != h2 || m1 != m2 || s1 != s2) {
			if(isValid(h1, m1, s1)) {
				System.out.println(h1 + ":"+m1+":"+s1);
				res++;
			}
			s1++;
			if(s1 == 60) {
				s1 = 0;
				m1++;
				if(m1 == 60) {
					m1 = 0;
					h1++;
				}
			}
		}
		return res;
	}
	public static boolean isValid(int x, int y, int z) {
		StringBuilder sb = new StringBuilder();
		if(x < 10) {
			sb.append("0");	
		}
		sb.append(x);
		if(y < 10) {
			sb.append("0");
		}
		sb.append(y);
		
		if(z < 10) {
			sb.append("0");
		}
		sb.append(z);
		String temp = sb.toString();
		Set<Character> set = new HashSet<>();
		for(int i = 0; i < temp.length(); i++) {
			char t = temp.charAt(i);
			if(!set.contains(t)) {
				set.add(t);
				if(set.size() > 2) {
					return false;
				}
			}
		}
		return true;
	}

}
