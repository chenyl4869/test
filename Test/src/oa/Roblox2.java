package oa;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Roblox2 {
//List Max
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] oper = {{1,2,10},{2,4,5},{3, 5, 12}};
		System.out.println(listMax(5, oper));
	}
	public static long listMax(int n, int[][] operations) {
		TreeMap<Integer, Integer> map = new TreeMap<>();
		for(int i = 0; i < operations.length; i++) {
			int start = operations[i][0];
			int end = operations[i][1];
			int val = operations[i][2];
			if(map.containsKey(start)) {
				map.put(start, map.get(start) + val);
			}else {
				map.put(start, val);
			}
			if(map.containsKey(end)) {
				map.put(end, map.get(end) - val);
			}else {
				map.put(end, -val);
			}
		}
		int res = Integer.MIN_VALUE;
		int temp = 0;
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			temp = temp + entry.getValue();
			res = Math.max(res, temp);
		}
		return res;
		
	}

}
