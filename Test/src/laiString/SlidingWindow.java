package laiString;

public class SlidingWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Q4_3("000", 1));
	}
	public static int Q4_3(String s, int k) {
		if(s.length() <= k) {
			return s.length();
		}
		int res = 0;
		int countZero = 0;
		int left = 0;
		int right = 0;
		for(right = 0; right < s.length(); right++) {
			char rightc = s.charAt(right);
			if(rightc == '0') {
				countZero++;
			}
			while(countZero > k) {
				char leftc = s.charAt(left);
				if(leftc == '0') {
					countZero--;
				}
				left++;
			}
			res = right - left + 1;
		}
		return res;
	}

}
