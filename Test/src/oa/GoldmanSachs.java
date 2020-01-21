package oa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;



public class GoldmanSachs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		solution1("caaab", 2);
//		String[][] input = new String[3][2];
//		input[0][0] = "bob";
//		input[0][1] = "88";
//		input[1][0] = "ted";
//		input[1][1] = "20";
//		input[2][0] = "ted";
//		input[2][1] = "180";
//		
//		System.out.println(solution2(input));
//		System.out.println( -3 % 9);
//		System.out.println(secondSmall(new int[]{8,2,7,5,4}));
//		String s = "abcd";
//		int[] dir = {0, 1, 0, 1};
//		int[] amount = {10, 10, 7, 5};
//		System.out.println(rotate(s, dir, amount));
//		int[] mapping = {3,5,4,6,2,7,9,8,0,1};
//		String[] input = {"990","332","32"};
//		System.out.println(Arrays.toString(strangeSort(mapping, input)));
		//List<List<Integer>> list = {{1,2,3},{7,8,9}};
		System.out.println(maxLCS("aabbbbaa"));
	}
	public static List<String> solution1(String s, int k) {
		List<String> list = new ArrayList<String>();
		if(k > s.length()) {
			return list;
		}
		TreeMap<String, Integer> tmap = new TreeMap<>();
		int left = 0;
		int right = k - 1;
		while(right < s.length()) {
			String curr = s.substring(left, right + 1);
			if(tmap.containsKey(curr)) {
				tmap.put(curr, tmap.get(curr) + 1);
			}else {
				tmap.put(curr, 1);
			}
			left++;
			right++;
		}
		
		for(Map.Entry<String, Integer> entry : tmap.entrySet()) {
			String key = entry.getKey();
			int value = entry.getValue();
			list.add(key);
			System.out.println("key = " + key);
		}
		return list;
	}
	public static int solution2(String[][] input) {
		if(input == null || input.length == 0 || input[0].length == 0) {
			return 0;
		}
		Map<String, double[]> map = new HashMap<>();
		for(int i = 0; i < input.length; i++) {
			String name = input[i][0];
			int score = Integer.parseInt(input[i][1]);
			if(map.containsKey(name)) {
				double[] temp = map.get(name);
				double count = temp[0];
				double total = temp[1];
				total += score;
				count++;
				temp[0] = count;
				temp[1] = total;
			}else {
				double[] temp = new double[2];
				temp[0] = 1;
				temp[1] = score;
				map.put(name, temp);
			}
		}
		
		int res = Integer.MIN_VALUE;
		for(Map.Entry<String, double[]> entry : map.entrySet()) {
			String key = entry.getKey();
			double[] temp = entry.getValue();
			int result = (int)Math.floor(temp[1] / temp[0]);
			res = Math.max(res, result);
		}
		return res;
		
	}

	public static int climbStairs(int n) {
		if(n == 1) {
			return 1;
		}
		if(n == 2) {
			return 2;
		}
		if(n == 3) {
			return 4;
		}
		int[] dp = new int[n+1];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		for(int i = 4; i < dp.length; i++) {
			dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3]; 
		}
		return dp[n];
	}
	
	public static int secondSmall(int[] array) {
		if(array.length <= 1) {
			return 0;
		}
		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] < first) {
				second = first;
				first = array[i]; 
			}else if(array[i] > first && array[i] < second) {
				second = array[i];
			}
		}
		return second;
	}

	public static String rotate(String s, int[] dir, int[] amount) {
		if(s.length() == 0) {
			return s;
		}
		int num = 0;
		for(int i = 0; i < dir.length; i++) {
			if(dir[i] == 1) {
				num += amount[i];
			}else {
				num -= amount[i];
			}
		}
		num = num % s.length();
		if(num == 0) {
			return s;
		}
		char[] arr = s.toCharArray();
		if(num < 0) {
			num = s.length() + num;
		}
		System.out.println(num);
		reverse(arr, 0, s.length() - num - 1);
		reverse(arr,s.length() - num, s.length()-1);
		reverse(arr, 0, s.length() - 1);
		return String.valueOf(arr);
		
	}
	public static void reverse(char[] arr, int i, int j) {
		while(i < j) {
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}


	public static String[] strangeSort(int[] mapping, String[] input) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < mapping.length; i++) {
			map.put(mapping[i], i);
		}
		
		Map<String, Integer> map2 = new HashMap<>();
		
		for(int i = 0; i < input.length; i++) {
			String s = input[i];
			int value = 0;
			for(int j = 0; j < s.length(); j++) {
				int curr = s.charAt(j) - '0';
				int temp = map.get(curr);
				value = value * 10 + temp;
			}
			map2.put(s, value);
		}
		
		Arrays.sort(input, new Comparator<String>() {
			public int compare(String o1, String o2) {
				if(o1.equals(o2)) {
					return 0;
				}else {
					int a = map2.get(o1);
					int b = map2.get(o2);
					return a - b;
				}
			}
		});
		return input;
	}
	
	public static int matrixGame(List<List<Integer>> matrix) {
		if(matrix == null || matrix.size() == 0 || matrix.get(0).size() == 0) {
			return 0;
		}
		int n = matrix.size();
		int m = matrix.get(0).size();
		int[][] mat = new int[m][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				mat[i][j] = matrix.get(i).get(j);
			}
		}
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for(int j = 0; j < n; j++) {
			int max = mat[j][0];
			for(int i = 1; i < m; i++) {
				max = Math.max(max, mat[i][j]);
			}
			pq.offer(max);
		}
		int a = 0;
		int b = 0;
		int count = 0;
		while(!pq.isEmpty()){
			if(count % 2 == 0) {
				a += pq.poll();
				count++;
			}else {
				b += pq.poll();
				count++;
			}
		}
		return a - b;
	}
	public static int maxLCS(String s) {
	    // Write your code here
	        Map<Character, Integer> map = new HashMap<>();
	        for(int i = 0; i < s.length(); i++){
	            char curr = s.charAt(i);
	            if(map.containsKey(curr)){
	                map.put(curr, map.get(curr) + 1);
	            }else{
	                map.put(curr, 1);
	            }
	        }
	        
	        Map<Character, Integer> map2 = new HashMap<>();
	        for(Map.Entry<Character, Integer> entry : map.entrySet()){
	            map2.put(entry.getKey(), 0);
	        }
	        int res = 0;
	        int temp = 0;
	        for(int i = 0; i < s.length() - 1; i++){
	            System.out.println("==================");
	            char curr = s.charAt(i);
	            int val = map.get(curr);
	            System.out.println("curr = "+curr);
	            System.out.println("val = "+val);
	            
	            
	            
	            int val2 = map2.get(curr);
	            if(val + val2 == 1) {
	            	continue;
	            }
	            val--;
	            map.put(curr, val);
	            val2++;
	            map2.put(curr, val2);
	            if(val2 <= val){
	                temp++;
	            }else {
	            	temp--;
	            }
	            res =Math.max(res, temp);
	            System.out.println("temp = "+temp);
	            System.out.println("res = " + res);
	        }
	        return res;
	    }

}
