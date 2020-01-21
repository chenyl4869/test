package laiString;

public class I_Love_Yahoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse("I Love Yahoo"));
	}
	public static String reverse(String s) {
		if(s == null || s.length() == 0) {
			return s;
		}
		char[] ss = s.toCharArray();
		int left = 0;
		int right = 0;
		while(right < s.length()) {
			while(right < s.length() && ss[right] != ' ') {
				right++;
			}
			helper(ss, left, right-1);
			left = right + 1;
			right++;
		}
		helper(ss, 0, ss.length-1);
		return String.valueOf(ss);
	}
	public static void helper(char[] ss, int i, int j) {
		while(i < j) {
			char temp = ss[i];
			ss[i] = ss[j];
			ss[j] = temp;
			i++;
			j--;
		}
	}

}
