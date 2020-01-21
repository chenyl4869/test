package lai;

public class DeDuplicate {
	// sorted array, de-duplicate, return length of new array
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int dedup(int[] a) {
		if(a==null|| a.length==0) {
			return 0;
		}
		int firstAvailablePos = 1;
		for(int i=1;i<a.length;i++) {
			if(a[i]!=a[i-1]) {
				a[firstAvailablePos] = a[i];
				firstAvailablePos++;
			}
		}
		return firstAvailablePos;
	}

}
