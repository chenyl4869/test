package lai;

public class MatrixBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static Boolean binarySearch(int[][] a,int target) {
		if(a==null||a[0].length==0) {
			return false;
		}
		int row = a.length;
		int col = a[0].length;
		int left = 0;
		int right = row*col-1;
		while(left<=right) {
			int mid = left+(right-left)/2;
			int row2 = mid/col;
			int col2 = mid%col;
			if(a[row2][col2]==target) {
				return true;
			}else if(a[row2][col2]<target) {
				left = mid+1;
			}else {
				right = mid -1;
			}
		}
		return false;
		
	}

}
