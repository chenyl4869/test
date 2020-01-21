package z10;

public class Q4_UniqueLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean solution(String x) {
		if(x == null || x.length() == 0) {
			return false;
		}
		int count = 0;
		for(int i = 0; i < x.length(); i++) {
			char temp = x.charAt(i);
			int t = temp - 'a';
			if(((count >>> t) & 1) == 1) {
				return false;
			}
			count = (1 << t) | count; 
		}
		return true;
	}

}
