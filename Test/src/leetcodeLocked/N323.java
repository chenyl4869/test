package leetcodeLocked;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;


public class N323 {
	public static void main(String[] args) {
		
	}
	public int countComponents(int n, int[][] edges) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        build(map, edges);
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for(Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            int key = entry.getKey();
            if(set.contains(key)) {
                continue;
            }
            List<Integer> list = entry.getValue();
            count++;
            DFS(set, key, map);
        }
        if(set.size() != n){
            count = count + n - set.size();
        }
        return count;

    }
    public void BFS(Set<Integer> set, int start, Map<Integer, List<Integer>> map) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                int curr = queue.poll();
                set.add(curr);
                List<Integer> list = map.get(curr);
                if(list == null){
                    continue;
                }
                for(int j = 0; j < list.size(); j++) {
                    int temp = list.get(j);
                    if(set.contains(temp)) {
                        continue;
                    }
                    queue.offer(temp);
                }
            }
        }

    }
    public void DFS(Set<Integer> set, int start, Map<Integer, List<Integer>> map) {
        set.add(start);
        List<Integer> list = map.get(start);
        for(Integer temp : list) {
            if(set.contains(temp)) {
                continue;
            }
            DFS(set, temp, map);
        }
    }

    public void build(Map<Integer, List<Integer>> map, int[][] edges) {
        for(int i = 0; i < edges.length; i++) {
            int[] t = edges[i];
            if(map.containsKey(t[0])) {
                map.get(t[0]).add(t[1]);
            }else {
                List<Integer> list = new ArrayList<>();
                list.add(t[1]);
                map.put(t[0],list);
            }

            if(map.containsKey(t[1])) {
                map.get(t[1]).add(t[0]);
            }else {
                List<Integer> list = new ArrayList<>();
                list.add(t[0]);
                map.put(t[1],list);
            }
        }
    }


}
