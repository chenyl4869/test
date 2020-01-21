package leetcode_51_100;

public class N55_JumpGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean canJump(int[] nums) {
		if(nums == null || nums.length==0) {
			return false;
		}
		int reach = 0;
		int i;
		for(i = 0; i <= reach; i++) {
			reach = Math.max(i+nums[i],reach);
			if(reach >= nums.length-1) {
				return true;
			}
		}
		return false;
		
    }

}
