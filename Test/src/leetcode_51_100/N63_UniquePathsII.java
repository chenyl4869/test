package leetcode_51_100;

public class N63_UniquePathsII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    	int m = obstacleGrid.length;
    	int n = obstacleGrid[0].length;
        int[][] matrix = new int[m][n];
        if(obstacleGrid[m-1][n-1] != 0) {
        	return 0;
        }
        int flag = 0;
        for(int i = 0; i < m; i++) {
        	if(obstacleGrid[i][0] != 0) {
        		flag = 1;
        	}
        	if(flag == 0) {
        		matrix[i][0] = 1;
        	}else {
        		matrix[i][0] = 0;
        	}
        }
        
        flag = 0;
        for(int i = 0; i < n; i++) {
        	if(obstacleGrid[0][i] != 0) {
        		flag = 1;
        	}
        	if(flag == 0) {
        		matrix[0][i] = 1;
        	}else {
        		matrix[0][i] = 0;
        	}
        }
        
        for(int i = 1; i < m; i++) {
        	for(int j = 1; j < n; j++) {
        		if(obstacleGrid[i][j] != 0) {
        			matrix[i][j] = 0;
        		}else {
					matrix[i][j] = matrix[i-1][j] + matrix[i][j-1];
				}
        		
        	}
        }
        
        return matrix[m-1][n-1];
    }
}
