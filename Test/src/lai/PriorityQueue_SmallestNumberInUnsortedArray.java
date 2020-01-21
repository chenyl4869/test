package lai;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueue_SmallestNumberInUnsortedArray {
/**
 * Find K smallest Number in unsorted array
 * A!=null
 * 0 <= K <= size of A
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int[] findKSmallestNumberUsingMinHeap(int[] a, int k) {
		if(a.length==0) {
			return new int[0];
		}
		PriorityQueue<Integer> pQueue = new PriorityQueue<>(a.length);
		for(int i=0;i<a.length;i++) {
			pQueue.offer(a[i]);
		}
		int[] res = new int[k];
		for(int i=0;i<k;i++) {
			res[i] = pQueue.poll();
		}
		return res;
	}
	public int[] findKSmallestNumberUsingMaxHeap(int[] a, int k) {
		if(a.length==0 || k==0) {
			return new int[0];
		}
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k,new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b) {
				if(a.equals(b)) {
					return 0;
				}
				return a>b ? -1:1;
				
			}
		});
		
		for(int i=0;i<a.length;i++) {
			if(i<k) {
				maxHeap.offer(a[i]);
			}else if(maxHeap.peek()>a[i]){
				maxHeap.poll();
				maxHeap.offer(a[i]);
			}
		}
		int[] res = new int[k];
		for(int i=k-1; i>=0;i--) {
			res[i] = maxHeap.poll();
		}
		return res;
		
		
	}

}
