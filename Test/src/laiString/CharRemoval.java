package laiString;

public class CharRemoval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(remove("     "));
	}
	public static String remove(String s) {
		if(s == null || s.length() == 0) {
			return s;
		}
		StringBuilder sb = new StringBuilder();
		int right = 0;
		int count = 0;
		while(right < s.length()) {
			while(right < s.length() && s.charAt(right) == ' ') {
				right++;
			}
			if(right == s.length()) {
				break;
			}
			if(count != 0) {
				sb.append(" ");
			}
			while(right < s.length() && s.charAt(right) != ' ') {
				sb.append(s.charAt(right));
				right++;
			}
			count++;
		}
		return sb.toString();
	}
	
	public static String remove2(String input){
		if(input == null || input.length() == 0){
			return input;
		}
		char[] arr = input.toCharArray();
		int i = 0;
		int j = 0;
		int count = 0;
		while(j < arr.length){
			while(j < arr.length && arr[j] == ' '){
				j++;
			}

			if(j == arr.length){
				break;
			}
			if(count != 0){
				arr[i] = ' ';
				i++;
			}
			while(j < arr.length && arr[j] != ' '){
				arr[i] = arr[j];
				i++;
				j++;
			}
		}
		return null;
	}

}
