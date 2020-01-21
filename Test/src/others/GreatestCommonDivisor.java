package others;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//在这判断刚开始分母不为0
		System.out.println(get(56,24));
	}
	public static int get(int a, int b) {
		while(a % b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return b;
	}
	public static int get2(int a, int b) {
		if(a % b == 0) {
			return b;
		}
		return get2(b, a % b);
	}

}
