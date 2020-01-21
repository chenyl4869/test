package laiString;


import java.util.ArrayList;
import java.util.List;

public class CharRemovalRepeatedly {
	
	public static void main(String[] args) {
		System.out.println(remove("abvv"));
	}
	public static String remove(String s) {
		if(s == null || s.length() == 0) {
			return s;
		}
		List<Character> list = new ArrayList<>();
		for(int i = 0; i < s.length(); i++) {
			char temp = s.charAt(i);
			if(list.isEmpty()) {
				list.add(temp);
			}else if(list.get(list.size()-1) == temp){
				list.remove(list.size()-1);
			}else {
				list.add(temp);
			}
		}
		StringBuilder sb = new StringBuilder();
		for(Character temp : list) {
			sb.append(temp);
		}
		return sb.toString();
		
	}
	
}
