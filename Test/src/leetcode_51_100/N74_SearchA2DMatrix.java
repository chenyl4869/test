package leetcode_51_100;

public class N74_SearchA2DMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean searchMatrix(int[][] matrix, int target) {
		if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
        	return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        
        int left = 0;
        int right = m-1;
        while(left < right - 1) {
        	int mid = left+(right-left)/2;
        	if(matrix[mid][0] == target) {
        		return true;
        	}else if(matrix[mid][0] > target) {
        		right = mid - 1;
        	}else {
        		left = mid;
        	}
        }
        int row;
        if(matrix[left][n-1] >= target) {
            row = left;
        }else{
            row = right;
        }
        
        left = 0;
        right = n-1;
        while(left <= right) {
        	int mid = left+(right-left)/2;
        	if(matrix[row][mid] == target) {
        		return true;
        	}else if(matrix[row][mid] > target) {
				right = mid -1;
			}else {
				left = mid + 1;
			}
        }
        return false;
        
    }

}
