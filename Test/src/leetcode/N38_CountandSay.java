package leetcode;

public class N38_CountandSay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String countAndSay(int n) {
		if(n<=0) {
			return null;
		}
		
        String init = "1";
        String tempRes = "";
        for(int j = 1;j<n;j++) {
        	if(n==1) {
        		return init;
        	}
        	int count = 1;
            for(int i=1;i<init.length();i++) {
            	
            	if(init.charAt(i)==init.charAt(i-1)) {
            		count++;
            	}else {
            		tempRes+=count;
            		tempRes+=init.charAt(i-1);
    				count=1;
    			}
            }
            tempRes+=count;
            tempRes+=init.charAt(init.length()-1);
            init = tempRes;
            tempRes = "";
        }
        return init;
    }
}
