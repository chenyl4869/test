package leetcode;

public class N28_ImplementStrStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int strStr(String haystack, String needle) {
		if(haystack==null||needle==null||needle.length()>haystack.length()) {
			return -1;
		}
		if(needle.length()==0) {
			return 0;
		}
        for(int i=0;i<=haystack.length()-needle.length();i++) {
        	
        	int j;
        	for(j = 0;j<needle.length();j++) {
        		if(haystack.charAt(i+j) != needle.charAt(j)) {
        			break;
        		}
        	}
        	if(j==needle.length()) {
        		return i;
        	}
        }
        return -1;
        
    }

}
