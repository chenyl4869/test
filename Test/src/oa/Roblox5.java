package oa;

import java.util.HashMap;
import java.util.Map;

public class Roblox5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(get("abcde", 2, 5, 3));
	}
	public static int get(String s, int min, int max, int maxUnique) {
		if(s.length() == 0) {
			return 0;
		}
		Map<String, Integer> map = new HashMap<>();
		for(int len = min; len <= max; len++) {
			int i = 0;
			int j = len + i - 1;
			Map<Character, Integer> m = new HashMap<>();
			for(int x = i; x <= j; x++) {
				m.put(s.charAt(x), 1);
			}
			while(j < s.length()) {
				if(m.size() <= maxUnique) {
					String sub = s.substring(i, j+1);
					if(map.containsKey(sub)) {
						map.put(sub, map.get(sub) + 1);
					}else {
						map.put(sub, 1);
					}
				}
				if(j == s.length() - 1) {
					break;
				}
				char si = s.charAt(i);
				
				if(m.get(si) == 1) {
					m.remove(si);
				}else {
					m.put(si, m.get(si) - 1);
				}
				i++;
				j++;
				char sj = s.charAt(j);
				if(m.containsKey(sj)) {
					m.put(sj, m.get(sj) + 1);
				}else {
					m.put(sj, 1);
				}
				
			}
		}
		int res = 0;
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			int value = entry.getValue();
			res = Math.max(res, value);
		}
		return res;
	}

}
