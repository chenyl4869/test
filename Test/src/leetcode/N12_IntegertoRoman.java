package leetcode;


public class N12_IntegertoRoman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		N12_IntegertoRoman x = new N12_IntegertoRoman();
		System.out.println(x.intToRoman(58));
	}
	public String intToRoman(int num) {
        char[] symbol = {'M','D','C','L','X','V','I'};
        int[] value= {1000, 500, 100, 50, 10, 5, 1};
        String res="";
        for(int n=0;n<7;n=n+2) {
        	int digit = num/value[n];
        	if(digit<4) {
        		for(int i=1;i<=digit;i++) {
        			res = res+symbol[n];
        		}
        	}else if(digit==4) {
        		res = res+symbol[n]+symbol[n-1];
        	}else if(digit>=5 && digit<=8) {
        		
        		res = res+symbol[n-1];
        		for(int i=6;i<=digit;i++) {
        			res = res+symbol[n];
        		}
        	}else if(digit==9) {
        		res = res+symbol[n]+symbol[n-2];
        	}
        	num = num%value[n];
        }
        return res;
    }

}
