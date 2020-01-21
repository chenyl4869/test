package lai;

import com.sun.media.sound.AlawCodec;

import training.Sort_MergeSort;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {3,5,1,10,4,2,9,6,8,7,0};
		MergeSort merge = new MergeSort();
		merge.mergesort(x, 0, x.length-1);
		for(int i=0;i<x.length;i++) {
			System.out.println(x[i]);
		}
	}
	
	public void mergesort(int a[], int left, int right) {
		if(a==null || a.length==0) {
			return;
		}
		if(left==right) {
			return;
		}
		int mid = left+(right-left)/2;
		mergesort(a, left, mid);
		mergesort(a, mid+1, right);
		combine(a, left, mid, right);
		
		
	}
	public void combine(int[] a, int l, int m, int r) {
		int len1 = m-l+1;
		int len2 = r-(m+1)+1;
		int[] x = new int[len1];
		int[] y = new int[len2];
		
		for(int i=0;i<len1;i++) {
			x[i]= a[l+i];
		}
		for(int i=0;i<len2;i++) {
			y[i] = a[m+1+i];
		}
		
		int i=0;
		int j=0;
		int k=l;
		while(i<len1 && j<len2) {
			if(x[i]<y[j]) {
				a[k] = x[i];
				i++;
				k++;
			}else {
				a[k] = y[j];
				j++;
				k++;
			}
		}
		while(i<len1) {
			a[k] = x[i];
			i++;
			k++;
		}
		while(j<len2) {
			a[k] = y[j];
			j++;
			k++;
		}
		
		
	}
	
}
