package laiString;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] s = {'a','b','c','d'};
		reverse(s);
		System.out.println(s);
	}
	public static void reverse(char[] s) {
		if(s == null || s.length == 0) {
			return;
		}
		int n = s.length;
		int left = 0;
		int right = n-1;
		while(left < right) {
			char temp = s[left];
			s[left] = s[right];
			s[right] = temp;
			left++;
			right--;
		}
	}
	
	public static void reverseRecursion(char[] s) {
		if(s == null || s.length == 0) {
			return;
		}
		helper(s, 0, s.length);
	}
	public static void helper(char[]s, int i, int j) {
		if(i >= j) {
			return;
		}
		char temp = s[i];
		s[i] = s[j];
		s[j] = temp;
		helper(s, i+1, j-1);
	}

}
