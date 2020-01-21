package oa;

public class PureStorage1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(0));
	}
	public static int solution(int num) {
		int res = 0;
		boolean isFive = false;
		boolean isOnSequence = false;
		int len = 0;
		String s = String.valueOf(num);
		for(int i = 0; i < s.length(); i++) {
			int temp = 0;
			char curr = s.charAt(i);
			int digit = curr - '0';
			if(digit == 7) {
				temp += 1;
			}
			if(digit % 2 == 0) {
				temp += 4;
			}
			if(isFive == false) {
				if(digit == 5) {
					if(i + 1 < s.length() && s.charAt(i+1) == '5') {
						isFive = true;
					}
				}
			}else {
				if(digit == 5) {
					temp += 3;
				}else {
					isFive = false;
				}
				
			}
			if(isOnSequence == false) {
				if(i + 1 < s.length() && (s.charAt(i+1) - '0') == digit - 1) {
					isOnSequence = true;
					len = 1;
				}else {
					temp += 1;
				}
			}else {
				if((s.charAt(i - 1) - '0') - 1 == digit) {
					len++;
				}else {
					temp += len * len;
					len = 0;
					isOnSequence = false;
					if(i + 1 < s.length() && (s.charAt(i+1) - '0') == digit - 1) {
						isOnSequence = true;
						len = 1;
					}else {
						temp += 1;
					}
				}
			}
			System.out.println("temp =" + temp);
			res += temp;
		}
		if(isOnSequence) {
			res += len * len;
		}
		//System.out.println("res = "+ res);
		if(num % 3 == 0) {
			res += 2;
		}
		return res;
	}

}
