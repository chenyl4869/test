package lai;

import sun.tools.jar.resources.jar;

public class String_Q5CharReplacemetn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(replace("studentden", "den", "XX"));
	}
	public static String replace(String input, String s1, String s2) {
		int fast = 0;
		StringBuilder sb  = new StringBuilder();
		while(fast < input.length()) {
			System.out.println(fast);
			if(fast <= input.length()-s1.length() && input.charAt(fast) == s1.charAt(0)) {
				int j;
				for(j = 0; j < s1.length(); j++) {
					if(input.charAt(fast+j) != s1.charAt(j)) {
						break;
					}
				}
				if(j == s1.length()) {
					fast = fast + j;
					for(int x = 0; x < s2.length(); x++) {
						sb.append(s2.charAt(x));
					}
					continue;
				}
			}
			sb.append(input.charAt(fast));
			fast++;
		}
		return sb.toString();
	}

}
