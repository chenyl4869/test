package lai;

import java.util.ArrayList;
import java.util.List;

public class String_Q2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(get(""));
	}
	public static String get(String input) {
		if(input == null || input.length() == 0) {
			return input;
		}
		int i = 0;
		List<Character> list = new ArrayList<>();
		while(i < input.length()) {
			if(!list.isEmpty() && input.charAt(i) == list.get(list.size()-1)) {
				while(i < input.length() && input.charAt(i) == list.get(list.size()-1)) {
					i++;
				}
				list.remove(list.size()-1);
			}else {
				list.add(input.charAt(i));
				i++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(char x : list) {
			sb.append(x);
		}
		return sb.toString();
	}
	

}
