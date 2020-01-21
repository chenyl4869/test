package leetcode_51_100;

public class N58_LengthofLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public int lengthOfLastWord(String s) {
        if(s == null || s.length() == 0) {
        	return 0;
        }
        int count = 0;
        for(int i = s.length()-1; i>=0; i--) {
        	if(s.charAt(i) == ' ' && count != 0) {
        		break;
        	}else if(s.charAt(i) != ' ' ) {
        		count++;
        	}
        	
        }
        
        return count;
    }
}
