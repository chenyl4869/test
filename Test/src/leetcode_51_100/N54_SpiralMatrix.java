package leetcode_51_100;

import java.util.ArrayList;
import java.util.List;

public class N54_SpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> res = new ArrayList<>();
        if(matrix == null) {
        	return res;
        }
        if(matrix.length == 0 || matrix[0].length == 0) {
        	return res;
        }
        
        int top = 0;
        int left = 0;
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;
        while(left < right && top < bottom) {
        	for(int i = left; i < right; i++) {
        		res.add(matrix[top][i]);
        	}
        	for(int i = top; i<bottom; i++) {
        		res.add(matrix[i][right]);
        	}
        	for(int i = right; i>left ;i--) {
        		res.add(matrix[bottom][i]);
        	}
        	for(int i = bottom; i>top; i--) {
        		res.add(matrix[i][left]);
        	}
        	left++;
        	right--;
        	top++;
        	bottom--;
        }
        if(left == right && top == bottom) {
        	res.add(matrix[top][left]);
        }
        if(top == bottom && left < right) {
        	for(int i=left;i<=right;i++) {
        		res.add(matrix[top][i]);
        	}
        }
        if(top<bottom && left == right) {
        	for(int i = top; i<= bottom;i++) {
        		res.add(matrix[i][left]);
        	}
        }
        return res;
        
    }
}
