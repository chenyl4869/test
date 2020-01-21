package oa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Clutter2 {
	
	public static void main(String[] args) {
		List<String> input = new ArrayList<>();
		input.add("9");
		input.add("mission statement");
		input.add("a quick bite to eat");
		input.add("a chip off the old block");
		input.add("chocolate bar");
		input.add("mission impossible");
		input.add("a man on a mission");
		input.add("block party");
		input.add("eat my words");
		input.add("bar of soap");
		
		List<String> res = get(input);
		for(String temp : res) {
			System.out.println(temp);
		}
	}
	public static List<String> get(List<String> input){
		List<String> res = new ArrayList<>();
		if(input.size() <= 1) {
			return res;
		}
		Map<String, List<String>> map = new HashMap<>();
		for(int i = 1; i < input.size(); i++) {
			String temp = input.get(i);
			String first = getFirst(temp);
			if(map.containsKey(first)) {
				map.get(first).add(temp);
			}else {
				List<String> curr = new ArrayList<>();
				curr.add(temp);
				map.put(first, curr);
			}
		}
		for(int i = 1; i < input.size(); i++) {
			String temp = input.get(i);
			String last = getLast(temp);
			if(!map.containsKey(last)) {
				continue;
			}
			List<String> t = map.get(last);
			for(int j = 0; j < t.size(); j++) {
				String temp2 = t.get(j);
				StringBuilder sb = new StringBuilder();
				sb.append(temp);
				sb.append(temp2.substring(last.length(), temp2.length()));
				res.add(sb.toString());
			}
		}
		return res;
		
	}
	public static String getFirst(String s) {
		StringBuilder sb = new StringBuilder();
		int i = 0;
		while(i < s.length() && s.charAt(i) != ' ') {
			sb.append(s.charAt(i));
			i++;
		}
		return sb.toString();
	}
	public static String getLast(String s) {
		StringBuilder sb = new StringBuilder();
		int i = s.length() - 1;
		while(i >= 0 && s.charAt(i) != ' ') {
			sb.append(s.charAt(i));
			i--;
		}
		return sb.reverse().toString();
	}
}
