package oa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Factual3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, List<String>> map = new HashMap<>();
		List<String> list = new ArrayList<>();
		list.add("apache-commons");
		list.add("guava");
		list.add("thrift");
		map.put("factual-commons", list);
		
		list = new ArrayList<>();
		list.add("apache-commons");
		list.add("hadoop");
		map.put("map-reduce", list);
		
		list = new ArrayList<>();
		list.add("hadoop");
		list.add("apache-commons");
		map.put("hive", list);
		
		list = new ArrayList<>();
		list.add("hive");
		list.add("factual-commons");
		map.put("hive-querier", list);
		
		System.out.println(get(map, "hive-querier"));
	}
	public static int get(Map<String, List<String>> map, String target) {
		int count = 0;
		Queue<String> queue = new LinkedList<>();
		Set<String> set = new HashSet<>();
		queue.offer(target);
		set.add(target);
		while(!queue.isEmpty()) {
			int size = queue.size();
			for(int i = 0; i < size; i++) {
				String curr = queue.poll();
				count++;
				if(!map.containsKey(curr)) {
					continue;
				}
				List<String> nextList = map.get(curr);
				for(String temp : nextList) {
					if(set.contains(temp)) {
						continue;
					}
					queue.offer(temp);
					set.add(temp);
				}
			}
		}
		return count;
	}

}
