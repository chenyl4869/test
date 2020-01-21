package training;

import lai.MergeSort;

public class Sort_MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {3,5,1,10,4,2,9,6,8,7,0};
		Sort_MergeSort merge = new Sort_MergeSort();
		merge.mergeSort(x, 0, x.length-1);
		for(int i=0;i<x.length;i++) {
			System.out.println(x[i]);
		}
	}
	public void mergeSort(int[] a, int left, int right) {
		if(left == right) {
			return;
		}
		int mid = left+(right-left)/2;
		mergeSort(a, left, mid);
		mergeSort(a, mid+1, right);
		merge(a, left, mid, right);
	}
	public void merge(int[] a, int left, int mid, int right) {
		int n1 = mid-left+1;
		int n2 = right - mid;
		
		int[] a1 = new int[n1];
		int[] a2 = new int[n2];
		
		for(int i=0;i<n1;i++) {
			a1[i] = a[left+i];
		}
		for(int j=0;j<n2;j++) {
			a2[j] = a[mid+1+j];
		}
		
		int i = 0;
		int j = 0;
		int k = left;
		while(i<n1 && j<n2) {
			if(a1[i] < a2[j]) {
				a[k] = a1[i];
				i++;
				k++;
			}else {
				a[k] = a2[j];
				j++;
				k++;
			}
		}
		while(i<n1) {
			a[k] = a1[i];
			i++;
			k++;
		}
		while(j<n2) {
			a[k] = a2[j];
			j++;
			k++;
		}
	}
}
