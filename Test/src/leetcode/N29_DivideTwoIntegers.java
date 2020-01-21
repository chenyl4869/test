package leetcode;

public class N29_DivideTwoIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		N29_DivideTwoIntegers n29  = new  N29_DivideTwoIntegers();
		System.out.println(n29.divide(7, -3));
	}
	// res,count可以是int，divid是long（divid=integer.min, divisor = 一个正数，就要把divid变成正数）,divis是long（因为要每次乘以2）
    public int divide(int dividend, int divisor) {
    	if(divisor == 0) {
    		return Integer.MAX_VALUE;
    	}
        if(dividend==Integer.MIN_VALUE && divisor==-1) {
        	return Integer.MAX_VALUE;
        }
        long divid = (long)dividend;
    	long divis = (long)divisor;
    	int resSign = 1;
    	if(dividend<0) {
    		resSign = -resSign;
    		divid = -divid;
    	}
    	if(divisor<0) {
    		resSign = -resSign;
    		divis = -divis;
    	}
    	int res = 0;
    	long t = divis;
    	while(divid >= t) {//不可以没有等于，否则1，1没法通过，res=0
    		int count = 1;
    		while(divid > (t<<1)) {//可以没有等于，带入6，3看看就知道
        		t = t<<1;
        		count = count<<1;
        		
        	}
    		divid = divid-t;
        	t= divis;
        	res = res+count;
    	}
    	if(resSign==-1) {
    		return -res;
    	}
    	return res;
    }

}
