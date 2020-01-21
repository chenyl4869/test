package oa;

import java.math.BigDecimal;

public class Factual1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] input = {{0, 90}, {300, 80}};
		System.out.println(get(input, 600));
	}
	public static double get(int[][] input, int target) {
		if(input == null || input.length == 0 || input[0].length == 0) {
			return 0;
		}
		if(target <= 0) {
			return 0;
		}
		double res = 0;
		for(int i = 0; i < input.length-1; i++) {
			double temp1 = input[i][0];
			double temp2 = input[i+1][0];
			int speed = input[i][1];
			if(temp2 > target) {
				temp2 = target;
			}
			res += speed * (temp2 - temp1)/60/60;
			if(temp2 > target) {
				BigDecimal bd = new BigDecimal(res);
				return bd.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
			}
		}
		
		res += input[input.length-1][1] * (double)(target - input[input.length-1][0])/60/60;
		BigDecimal bd = new BigDecimal(res);
		return bd.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
	}

}
