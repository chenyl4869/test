package z1;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {3,5,1,10,4,2,9,6,8,7,0};
		mergeSort(x, 0, x.length-1);
		System.out.println(Arrays.toString(x));
		
	}
	public static void mergeSort(int[] input, int start, int end) {
		if(end == start) {
			return;
		}
		int mid = start + (end - start)/2;
		mergeSort(input, start, mid);
		mergeSort(input, mid+1, end);
		merge(input, start, mid, mid+1, end);
		
		
	}
	public static void merge(int[] input, int s1, int e1, int s2, int e2) {
		int[] x = new int[e1-s1+1];
		int[] y = new int[e2-s2+1];
		int t1 = s1;
		int t2 = s2;
		for(int i = 0; i < x.length; i++) {
			x[i] =  input[t1];
			t1++;
		}
		for(int i = 0; i < y.length; i++) {
			y[i] = input[t2];
			t2++;
		}
		int temp = s1;
		int xtemp = 0;
		int ytemp = 0;
		while(xtemp < x.length && ytemp < y.length) {
			if(x[xtemp] < y[ytemp]) {
				input[temp] = x[xtemp];
				xtemp++;
			}else {
				input[temp] = y[ytemp];
				ytemp++;
			}
			temp++;
		}
		while(xtemp < x.length) {
			input[temp] = x[xtemp];
			temp++;
			xtemp++;
		}
		while(ytemp < y.length) {
			input[temp] = y[ytemp];
			temp++;
			ytemp++;
		}
	}

}
