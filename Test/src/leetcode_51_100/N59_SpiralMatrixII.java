package leetcode_51_100;

public class N59_SpiralMatrixII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int[][] generateMatrix(int n) {
		if(n < 1) {
			return null;
		}
        int[][] matrix = new int[n][n];
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = n-1;
        int x = 1;
        while(left < right && top < bottom) {
        	for(int i = left; i < right; i++) {
        		matrix[top][i] = x;
        		x++;
        	}
        	for(int i = top; i< bottom; i++) {
        		matrix[i][right] = x;
        		x++;
        	}
        	for(int i = right; i>left; i--) {
        		matrix[bottom][i] = x;
        		x++;
        	}
        	for(int i = bottom; i>top; i--) {
        		matrix[i][left] = x;
        		x++;
        	}
        	left++;
        	right--;
        	top++;
        	bottom--;
        	
        }
        if(n % 2 != 0) {
        	matrix[top][left] = n * n;
        }
        return matrix;
    }

}
