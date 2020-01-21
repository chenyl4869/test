package training;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int binarySearch(int a[],int target) {
		if(a==null || a.length==0) {
			return -1;
		}
		int left = 0;
		int right = a.length-1;
		while(left<=right) {
			int mid = left+(right-left)/2;
			if(a[mid]==target) {
				return mid;
			}else if(a[mid]<target) {
				left = mid+1;
			}else {
				right = mid - 1;
			}
		}
		return -1;
	}

}
