package leetcode;

public class N43_MultiplyStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String multiply(String num1, String num2) {
        if(num1==null || num2==null || num1.length()==0 || num2.length()==0) {
        	return null;
        }
        int[] res = new int[num1.length()+num2.length()];	
        for(int i=num2.length()-1 ; i>=0;i--) {
        	for(int j = num1.length() - 1;j>=0;j-- ) {
        		int tempProduct = (num2.charAt(i)-'0')*(num1.charAt(j)-'0');
        		tempProduct += res[i+j+1]; 
        		int c = tempProduct/10;
        		int digit = tempProduct%10;
        		res[i+j+1] = digit;
        		res[i+j] += c;
        		
        	}
        }
        StringBuilder result = new StringBuilder();
        for(int i = 0;i<res.length;i++) {
        	if(!(result.length()==0 && res[i]==0)) {
        		result.append(res[i]);
        	}
        }
        if(result.length()==0) {
        	return "0";
        }
        return result.toString();
    }

}
