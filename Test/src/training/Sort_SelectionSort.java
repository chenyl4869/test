package training;

public class Sort_SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void selectionSort(int[] a) {
		int globalMin;
		for(int i=0;i<a.length;i++) {
			globalMin = i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[globalMin]) {
					globalMin = j;
				}
			}
			int temp = a[globalMin];
			a[globalMin] = a[i];
			a[i] = temp;
		}
	}

}
