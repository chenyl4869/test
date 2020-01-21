package lai;

public class BinarySearch_FirstPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int firstPosition(int[] a, int target) {
		if(a==null || a.length==0) {
			return -1;
		}
		int left = 0;
		int right = a.length-1;
		while(left<right-1) {
			int mid = left+(right-left)/2;
			if(a[mid]==target) {
				right = mid;
			}else if(a[mid]<target) {
				left = mid+1;
			}else {
				right = mid-1;
			}
		} 
		
		if(a[left]==target) {
			return left;
		}
		if(a[right]==target) {
			return right;
		}
		return -1;
	}

}
