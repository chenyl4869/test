package leetcode;

public class N941_ValidMountainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean validMountianArray(int[] a) {
		if(a==null || a.length<3) {
			return false;
		}
		boolean has_up = false;
		boolean has_down = false;
		for(int i=1;i<a.length;i++) {
			if(a[i]-a[i-1]>0) {
				if(has_down) {
					return false;
				}
				has_up=true;
			}else if(a[i]<a[i-1]) {
				if(has_up==false) {
					return false;
				}
				has_down = true;
			}else {
				return false;
			}
		}
		if(has_up==true && has_down==false) {
			return false;
		}
		return true;
	}
}
