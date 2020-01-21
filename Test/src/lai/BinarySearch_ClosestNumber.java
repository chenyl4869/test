package lai;

public class BinarySearch_ClosestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {2,5,6,11,20};
		int target = 0;
		System.out.println(binarySearch_ClosestNumber(a,target));
	}
	public static int binarySearch_ClosestNumber(int[] a,int target) {
		int left = 0;
		int right = a.length-1;
		while(left<right-1) {
			int mid = left+(right-left)/2;
			if(a[mid]==target) {
				return mid;
			}else if (a[mid]<target) {
				left = mid;
			}else {
				right = mid;
			}
		}
		System.out.println("left:"+left);
		System.out.println("right:"+right);
		if(target-a[left]<a[right]-target) {
			return left;
		}else {
			return right;
		}
	}

}
