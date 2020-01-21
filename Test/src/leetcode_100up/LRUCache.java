package leetcode_100up;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
	Map<Integer, Node> m = new HashMap<>();
    Node head = new Node(0, 0);
    Node tail = new Node(0, 0);
    
    int cap = 0;
    public LRUCache(int capacity) {
        head.next = tail;
        tail.pre = head;
        cap = capacity;
    }
    
    public int get(int key) {
        if(m.containsKey(key)){
            int res = m.get(key).value;
            moveToFirst(m.get(key));
            return res;
        }else{
            return -1;
        }
        
    }
    
    public void put(int key, int value) {
        if(m.containsKey(key)){
            //System.out.println("m.size()="+m.size());
            Node temp = m.get(key);
            temp.value = value;
            moveToFirst(temp);
        }else{
            if(m.size() == cap){
                m.remove(tail.pre.key);
                deleteLast();
                
                //System.out.println("m.size()="+m.size());
            }
            Node temp = new Node(key, value);
            addFirst(temp);
            m.put(key, temp);
        }
    }
    public void addFirst(Node temp){
        if(m.size() == cap){
            m.remove(tail.pre.key);
            deleteLast();
        }
        Node first = head.next;
        head.next = temp;
        temp.next = first;
        first.pre = temp;
        temp.pre = head;
    }
    public void deleteLast(){
        Node last = tail.pre.pre;
        Node temp = tail.pre;
        temp.pre = null;
        temp.next = null;
        last.next = tail;
        tail.pre = last;
    }
    public void moveToFirst(Node temp){
        Node tempPre = temp.pre;
        Node tempNext = temp.next;
        Node first = head.next;
        temp.next = first;
        temp.pre = head;
        head.next = temp;
        first.pre = temp;
        tempPre.next = tempNext;
        tempNext.pre = tempPre;
    }
        
}
