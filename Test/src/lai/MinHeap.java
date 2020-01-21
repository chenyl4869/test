package lai;
/**
 * 自己实现min heap
 * @author ylchen
 *
 */
public class MinHeap {
	private int[] array;
	private int size;
	public MinHeap(int[] array) {
		if(array==null||array.length==0) {
			throw new IllegalArgumentException("array is empty");
		}
		
		this.array = array;
		size = array.length;
		heapify();
	}
	public void heapify() {
		for(int i=(size-1-1)/2;i>=0;i--) {
			percolateDown(i);
		}
	}
	public void percolateUp(int index) {
		
		while(index>0) {
			int parentIndex = (index-1)/2;
			if(array[parentIndex]>array[index]) {
				int temp = array[parentIndex];
				array[parentIndex] = array[index];
				array[index] = temp;
				
			}else {
				break;
			}
			index = parentIndex;
		}
	}
	public void percolateDown(int index) {
		while(index <= ((size-1)-1)/2) {//index>最后一个非叶子节点的index,就结束
			int leftChild = index * 2 + 1;
			int rightChild = index * 2 + 2;
			int changeChild = leftChild;
			if(rightChild<=size-1 && array[rightChild]<array[leftChild]) {
				changeChild = rightChild;
			}
			if(array[index]>array[changeChild]) {
				int temp = array[changeChild];
				array[changeChild] = array[index];
				array[index] = temp;
			}else {
				break;
			}
			index = changeChild;
		}
	}
	public void offer(int value) {
		if(size==array.length) {
			int newLength = (int)1.5 * array.length;
			int[] newArray = new int[newLength];
			System.arraycopy(array, 0, newArray, 0, array.length);
			array = newArray;
		}
		array[size]=value;
		size++;
		percolateUp(size-1);
	}
	public Integer poll() {
		if(size==0) {
			return null;
		}
		int res = array[0];
		array[0]=array[size-1];
		size--;
		percolateDown(0);
		return res;
		
	}
	public Integer peek() {
		if(size==0) {
			return null;
		}
		return array[0];
	}
	//return original value
	public int update(int index,int ele) {
		if(index<0||index>size-1) {
			throw new ArrayIndexOutOfBoundsException("invalid index range");
		}
		int originalValue = array[index];
		array[index] = ele;
		if(originalValue>ele) {//变小了，向上调整
			percolateUp(index);
		}else {
			percolateDown(index);
		}
		return originalValue;
	}
}
