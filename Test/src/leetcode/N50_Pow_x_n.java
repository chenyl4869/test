package leetcode;

public class N50_Pow_x_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public double myPow(double x, int n) {
		
		double result = recursion(x, n);
		if(n<0) {
			return 1/result;
		}
        return result;
    }
	public double recursion(double x, int n) {
		if(n==0) {
        	return 1;
        }
		double half = recursion(x, n/2);
		if(n%2 == 0) {
        	return half * half;
        }else {
        	return half * half * x;
        }
	}
	

}
