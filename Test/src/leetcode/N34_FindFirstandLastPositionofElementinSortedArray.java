package leetcode;

public class N34_FindFirstandLastPositionofElementinSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int[] searchRange(int[] nums, int target) {
        if(nums==null || nums.length==0) {
        	int[] res = {-1,-1};
        	return res;
        }
        int[] res = new int[2];
        int left = 0;
        int right = nums.length-1;
        while(left<=right) {
        	int mid = left+(right-left)/2;
        	if(nums[mid] == target) {
        		int x = mid;
        		int y = mid;
        		while(x-1>=0 && nums[x-1]==target) {
        			x--;
        		}
        		while(y+1<nums.length && nums[y+1]==target) {
        			y++;
        		}
        		res[0] = x;
        		res[1] = y;
        		return res;
        	}else if(nums[mid]<target) {
        		left = mid+1;
        	}else {
        		right = mid - 1;
        	}
        }
        res[0] = -1;
        res[1] = -1;
        return res;
    }
}
