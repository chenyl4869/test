package lai;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a []= {1,5,2,4,3,0};
		SelectionSort(a,6);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	// descending
	public static void SelectionSort(int a[],int n) {
		int temp,g;
		for(int i=0;i<n;i++) {
			g=i;
			for(int j=i+1;j<n;j++) {
				if(a[j]>a[g]) {
					g=j;
				}
			}
			temp = a[i];
			a[i] = a[g];
			a[g] = temp;
		}
	}

}
