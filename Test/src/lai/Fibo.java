package lai;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getFibo(6));
	}
	
	public static int getFibo(int n) {
		if(n<0) {
			return -1;
		}
		if(n==0) {
			return 0;
		}else if (n==1) {
			return 1;
		}
		
		int res = getFibo(n-1)+getFibo(n-2);
		return res;
	}

}
