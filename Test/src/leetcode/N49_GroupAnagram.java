package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class N49_GroupAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++) {
        	char[] str = strs[i].toCharArray();
        	Arrays.sort(str);
        	String x = String.valueOf(str);
        	
        	if(!map.containsKey(x)) {
        		List<String> list = new ArrayList<>();
        		list.add(strs[i]);
        		map.put(x, list);
        	}else {
        		List<String> list = map.get(x);
        		list.add(strs[i]);
        		map.put(x, list);
        	}
        }
        return new ArrayList<>(map.values());
    }
}
