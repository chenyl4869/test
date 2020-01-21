package leetcode_51_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.sun.xml.internal.ws.api.model.wsdl.editable.EditableWSDLFault;

import tools.Interval;

public class N56_MergeIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<Interval> merge(List<Interval> intervals) {
		List<Interval> res = new ArrayList<>();
        if(intervals == null || intervals.isEmpty()) {
        	return res;
        }
        int[] start = new int[intervals.size()];
        int[] end = new int[intervals.size()];
        for(int i = 0; i<intervals.size();i++) {
        	start[i] = intervals.get(i).start;
        	end[i] = intervals.get(i).end;
        }
        Arrays.sort(start);
        Arrays.sort(end);
        
        int s = start[0];
        int e = 0;
        for(int i = 0; i < start.length;i++) {
        	if(i+1 < start.length && end[i] >= start[i+1]) {
        		
        	}else if(i+1 < start.length && end[i] < start[i+1]){
        		Interval temp = new Interval(s,end[i]);
				res.add(temp);
				s = start[i+1];
			}else {
				Interval temp = new Interval(s,end[i]);
				res.add(temp);
			}
        }
        return res;
    }

}
