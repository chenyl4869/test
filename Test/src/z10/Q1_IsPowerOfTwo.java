package z10;

public class Q1_IsPowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//non bit method
	public static boolean solution(int x) {
		if(x <= 0) {
			return false;
		}
		while(x != 1) {
			if(x % 2 != 0) {
				return false;
			}
			x = x / 2;
		}
		return true;
	}

}
