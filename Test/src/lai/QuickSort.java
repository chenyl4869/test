package lai;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3,5,1,2,4,8};
		quickSort(a);
		System.out.println(Arrays.toString(a));
	}

	public static int[] quickSort(int[] array) {
		// Write your solution here
		if (array == null || array.length == 0) {
			return array;
		}
		solution(array, 0, array.length - 1);
		return array;
	}

	public static void solution(int[] array, int left, int right) {
		if (left >= right) {
			return;
		}
		int p = helper(array, left, right);
		System.out.println(p);
		solution(array, left, p - 1);
		solution(array, p + 1, right);
	}

	public static int helper(int[] array, int left, int right) {
		int pivot = array[right];
		int i = left;
		int j = right;
		while (i < j) {
			while (i < j && array[i] <= pivot) {// 这里是小于等于
				i++;
			}
			while (i < j && array[j] >= pivot) {//这里是 大于等于
				j--;
			}
			System.out.println("i = "+i+" j = "+ j);
			
			if (i >= j) { //可以是i == j 因为每次一个先移动，一个后移动，两个不会错过，最终只能是i==j而不会i比j小1
				break;
			}
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			System.out.println(Arrays.toString(array));
		}
		int temp = array[right];
		array[right] = array[i];
		array[i] = temp;
		System.out.println("pivot = " + i);
		System.out.println("change pivot : " + Arrays.toString(array));
		return i;
	}
}
