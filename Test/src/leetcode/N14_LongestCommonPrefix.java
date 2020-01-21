package leetcode;

public class N14_LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs= {"c","c"};
		N14_LongestCommonPrefix n14 = new N14_LongestCommonPrefix();
		System.out.println(n14.longestCommonPrefix(strs));
	}
	public String longestCommonPrefix(String[] strs) {
		if(strs==null||strs.length==0) {
			return "";
		}
		String result = "";
        for(int i=0;i<strs[0].length();i++) {
        	char x = strs[0].charAt(i);
        	for(int j =1;j<strs.length;j++) {
        		if(strs[j].length()-1<i) {
        			return result;
        		}
        		else if(strs[j].charAt(i)!=x) {
        			return result;
        		}
        	}
        	result = result+x;
        }
        return result;
    }
}
