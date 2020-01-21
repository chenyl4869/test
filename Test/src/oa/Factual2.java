package oa;

import java.util.Arrays;
import java.util.Comparator;

import jdk.internal.org.objectweb.asm.tree.IntInsnNode;

public class Factual2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] input = {{-4,3},{-2,1},{1,0},{3,2}};
		int[][] x = {{1,2}};
		System.out.println(get(input));
	}
	public static int get(int[][] input) {
		if(input== null || input.length == 0 || input[0].length == 0) {
			return 0;
		}
		Arrays.sort(input, new Comparator<int[]>() {
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		});
		int left = 0;
		int right = input.length - 1;
		int mid = left + (right - left)/2;
		int midValue = input[mid][0];
		if(input.length % 2 == 0) {
			midValue += (input[mid+1][0] - input[mid][0])/2;
		}
		int distX = 0;
		for(int i = 0; i < input.length; i++) {
			int temp = input[i][0];
			distX += Math.abs(temp - midValue);
		}
		
		Arrays.sort(input, new Comparator<int[]>() {
			public int compare(int[] o1, int[] o2) {
				return o1[1] - o2[1];
			}
		});
		
		midValue = input[mid][1];
		if(input.length % 2 == 0) {
			midValue += (input[mid+1][1] - input[mid][1]) / 2;
		}
		int distY = 0;
		for(int i = 0; i < input.length; i++) {
			int temp = input[i][1];
			distY += Math.abs(temp - midValue);
		}
		return distX+distY;
		
		
	}

}
