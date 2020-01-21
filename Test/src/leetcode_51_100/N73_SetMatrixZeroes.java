package leetcode_51_100;

public class N73_SetMatrixZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void setZeroes(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		boolean firstRowZero = false;
        boolean firstColumnZero = false;
        
        for(int i = 0; i < m; i++) {
        	if(matrix[i][0] == 0) {
        		firstColumnZero = true;
        		break;
        	}
        }
        
        for(int i = 0; i<n;i++) {
        	if(matrix[0][i] == 0) {
        		firstRowZero = true;
        		break;
        	}
        }
        
        for(int i = 1; i<m;i++) {
        	for(int j = 1; j<n;j++) {
        		if(matrix[i][j] == 0) {
        			matrix[0][j] = 0;
        			matrix[i][0] = 0;
        		}
        	}
        }
        
        for(int i = 1;i<m;i++) {
        	if(matrix[i][0] == 0) {
        		for(int j = 1; j<n;j++) {
        			matrix[i][j] = 0;
        		}
        	}
        }
        
        for(int i = 1; i<n;i++) {
        	if(matrix[0][i] == 0) {
        		for(int j = 1; j<m;j++) {
        			matrix[j][i] = 0;
        		}
        	}
        }
        
        if(firstRowZero) {
        	for(int i = 0; i<n;i++) {
        		matrix[0][i] = 0;
        	}
        }
        if(firstColumnZero) {
        	for(int i = 0;i<m;i++) {
        		matrix[i][0] = 0;
        	}
        }
        
    }
}
