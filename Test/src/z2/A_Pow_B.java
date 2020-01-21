package z2;

public class A_Pow_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = get(-3, 3);
		System.out.println(x);
	}
	//b仅限正数 a仅限整数
	public static int get(int a, int b) {
		
		if(b == 0) {
			return 1;
		}
		int res = 0;
		int half = get(a, b/2);
		if(b % 2 == 0) {
			res = half * half;
		}else {
			res = half * half * a;
		}
		return res;
	}

}
