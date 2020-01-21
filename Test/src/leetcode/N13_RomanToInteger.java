package leetcode;

import java.util.HashMap;
import java.util.Map;

public class N13_RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int romanToInt(String s) {
        int res = 0;
        Map<Character,Integer> m = new HashMap<>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);
        for(int i=0;i<s.length();i++) {
        	char d = s.charAt(i);
        	int digit = m.get(d);
        	if(i==s.length()-1 || m.get(s.charAt(i+1))<=m.get(d)) {
        		res = res+digit;
        	}else{
        		res = res-digit;
        	}
        }
        return res;
    } 

}
