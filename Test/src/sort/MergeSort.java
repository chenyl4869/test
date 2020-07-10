package sort;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int[] array = {1,3,5,2,0,9,6,7,3};
		MergeSort mergeSort = new MergeSort();
		mergeSort.mergeSort(array);
		System.out.println(Arrays.toString(array));
	}
	
	public void mergeSort(int[] array) {
		sort(array, 0, array.length - 1);
	}
	public void sort(int[] array, int left, int right) {
		if(left == right) {
			return;
		}
		int mid = left + (right - left) / 2;
		
		sort(array, left, mid);
		sort(array, mid+1, right);
		combine(array, left, mid, right);
		
	}
	public void combine(int[] array, int left, int mid ,int right) {
		int[] a1 = new int[mid - left + 1];
		int[] a2 = new int[right - (mid+1) + 1];
		int tempLeft = left;
		for(int i = 0; i < a1.length; i++) {
			a1[i] = array[tempLeft];
			tempLeft++;
		}
		int tempRight = mid+1;
		for(int i = 0; i < a2.length; i++) {
			a2[i] = array[tempRight];
			tempRight++;
		}
		
		int temp1 = 0;
		int temp2 = 0;
		int temp = left;
		while(temp1 < a1.length && temp2 < a2.length) {
			if(a1[temp1] < a2[temp2]) {
				array[temp] = a1[temp1];
				temp++;
				temp1++;
			}else {
				array[temp] = a2[temp2];
				temp++;
				temp2++;
			}
		}
		while(temp1 < a1.length) {
			array[temp] = a1[temp1];
			temp++;
			temp1++;
		}
		while(temp2 < a2.length) {
			array[temp] = a2[temp2];
			temp++;
			temp2++;
		}
	}
}
