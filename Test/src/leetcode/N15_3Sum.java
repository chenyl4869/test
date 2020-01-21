package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class N15_3Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,4,-1,9,10,5,-8};
		N15_3Sum n15 = new N15_3Sum();
		n15.threeSum(nums);
		
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}
	//2个优化,2个去重
	public List<List<Integer>> threeSum(int[] nums) {
		if(nums==null || nums.length<3) {
			return null;
		}
		List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        if(nums[0]>0 || nums[nums.length-1]<0) {
        	return null;
        }
        for(int i=0;i<nums.length-2;i++) {
        	if(nums[i]>0) {
        		break;
        	}
        	if(i>0 && nums[i]==nums[i-1]) {
        		continue;
        	}
        	int target = 0-nums[i];
        	int left = i+1;
        	int right = nums.length-1;
        	while(left<right) {
        		if(nums[left]+nums[right]<target) {
        			left++;
        			
        		}else if(nums[left]+nums[right]>target) {
        			right--;
        			
        		}else{
        			List<Integer> tempResult = new ArrayList<>();
        			tempResult.add(nums[i]);
        			tempResult.add(nums[left]);
        			tempResult.add(nums[right]);
        			res.add(tempResult);
        			left++;
        			right--;
        			while(left<right && nums[left]==nums[left-1]) {
        				left++;
        			}
        			while(left<right && nums[right]==nums[right+1]) {
        				right--;
        			}
        		}
        	}
        }
        return res;
    }

}
