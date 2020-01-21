package leetcode;

public class N9_PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		N9_PalindromeNumber n9 = new N9_PalindromeNumber();
		System.out.println(n9.isPalindrome(121));
	}
	public boolean isPalindrome(int x) {
		if(x<0) {
			return false;
		}
		int div = 1;
		while(x/div>10) {
			div = div*10;
		}
		//System.out.println(div);
		while(x>0) {
			int left = x/div;
			int right = x%10;
			System.out.println("l"+left);
			System.out.println("r"+right);
			if(left!=right) {
				return false;
			}
			System.out.println("x:"+x);
			
			x = x%div;
			x = x/10;
			div = div/100;
			System.out.println("x:"+x);
			System.out.println("div:"+div);
		}
		return true;
	}

}
