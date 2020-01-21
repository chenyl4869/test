package oa;

public class Clutter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(get("  c"));
	}
	public static String get(String input) {
		StringBuilder sb = new StringBuilder();
		int i = input.length() - 1;
		while(i >= 0) {
			while(i >= 0 && input.charAt(i) == ' ') {
				i--;
			}
			if(i < 0) {
				break;
			}
			sb.append(input.charAt(i));
			if(sb.length() == 1) {
				sb.append(" ");
			}
			if(sb.length() == 3) {
				break;
			}
			i--;
		}
		return sb.toString();
	}

}
