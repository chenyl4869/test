package z1;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a []= {1,5,2,4,3,0};
		SelectionSort(a);
		System.out.println(Arrays.toString(a));
		
	}
	public static void SelectionSort(int[] input) {
		
		for(int i = 0; i < input.length; i++) {
			int min = i;
			for(int j = i; j < input.length; j++) {
				if(input[min] > input[j]) {
					min = j;
				}
			}
			int temp = input[min];
			input[min] = input[i];
			input[i] = temp;
		}
		
	}

}
