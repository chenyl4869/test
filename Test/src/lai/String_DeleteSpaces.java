package lai;

import com.sun.xml.internal.fastinfoset.algorithm.FloatEncodingAlgorithm;

public class String_DeleteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(delete("    abc  c 22 0asd    v    "));
	}
	public static String delete(String input) {
		StringBuilder sb = new StringBuilder();
		int j = 0;
		int flag = 0;
		while(j < input.length()) {
			
			while(j < input.length() && input.charAt(j) ==' ') {
				j++;
			}
			if(j == input.length()) {
				break;
			}
			if(flag == 1) {
				sb.append(" ");
			}
			while(j<input.length() && input.charAt(j) != ' ') {
				
				sb.append(input.charAt(j));
				j++;
			}
			flag = 1;
			
		}
		return sb.toString();
	}

}
