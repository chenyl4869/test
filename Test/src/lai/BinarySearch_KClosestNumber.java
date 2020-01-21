package lai;

public class BinarySearch_KClosestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearch_KClosestNumber test = new BinarySearch_KClosestNumber();
		int[] a = {1,3,5,9,14,15,17,25,50,54,62,100};
		int k = 4;
		int target = 0;
		int[] res = test.kClosestNumber(a, k, target);
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}
	}
	public int[] kClosestNumber(int[] a,int k,int target) {
		if(a==null || a.length==0) {
			return a;
		}
		if(k<=0 || k>a.length) {
			return new int[0];
		}
		int left = largestSmallerEqual(a, target);
		System.out.println("left"+left);
		int right = left+1;
		int[] res = new int[k];
		for(int i=0;i<k;i++) {
			if(right >= a.length || left>=0 && target-a[left] < a[right]-target) {
				res[i] = a[left];
				left--;
			}else {
				res[i] = a[right];
				right++;
			}
		}
		return res;
		
	}
	public int largestSmallerEqual(int[] a,int target) {
		int left = 0;
		int right = a.length-1;
		while(left<right-1) {
			int mid = left+(right-left)/2;
			if(a[mid]<=target) {
				left = mid;
			}else {
				right = mid;
			}
		}
		if(target>=a[right]) {
			return right;
		}
		if(target>=a[left]){
			return left;
		}
		return -1;
	}

}
