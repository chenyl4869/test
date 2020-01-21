package leetcode;

public class N7_ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		N7_ReverseInteger n7 = new N7_ReverseInteger();
		System.out.println(n7.reverse(-123));
	}
	//考虑：正数，负数，0，溢出。
	public int reverse(int x) {
		int res = 0;
		while(x!=0) {
			int t = res*10+x%10;
			System.out.println("t : "+t);
			if(t/10 != res) {
				return 0;
			}
			res = t;
			x = x/10;
			System.out.println("x : "+x);
		}
		
		return res;
	}
}
