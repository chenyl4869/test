package testAstar;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(getDistance(42.280826, -83.743038, 42.529477, -83.780221));
		Map<String, Double> tempmap = new HashMap<>();
		tempmap.put("Brighton", 19.2);
		tempmap.put("Plymouth", 17.2);
		tempmap.put("Romulus", 23.1);
		Map<String, Map<String, Double>> map1 = new HashMap<>();
		map1.put("Ann Arbor", tempmap);
		
		Map<String, Double> tempmap2 = new HashMap<>();
		tempmap2.put("Farmington Hills", 21.4);
		tempmap2.put("Pontiac", 34.1);
		
		map1.put("Brighton", tempmap2);
		
		Map<String, Double> tempmap3 = new HashMap<>();
		tempmap3.put("Romulus", 23.1);
		tempmap3.put("Farmington Hills", 14.0);
		tempmap3.put("Detroit", 27.9);
		
		map1.put("Plymouth", tempmap3);
		
		Map<String, Double> tempmap4 = new HashMap<>();
		tempmap4.put("Detroit", 31.0);
		map1.put("Romulus", tempmap4);
		
		Map<String, Double> tempmap5 = new HashMap<>();
		tempmap5.put("Royal Oak", 16.9);
		tempmap5.put("Detroit", 28.3);
		tempmap5.put("Pontiac", 15.5);
		map1.put("Farmington Hills", tempmap5);
		
		Map<String, Double> tempmap6 = new HashMap<>();
		tempmap6.put("Sterling Heights", 17.2);
		tempmap6.put("Royal Oak", 13.3);
		map1.put("Pontiac", tempmap6);
		
		
		Map<String, Double> tempmap7 = new HashMap<>();
		tempmap7.put("Pontiac", 27.8);
		tempmap7.put("Sterling Heights", 16.5);
		map1.put("Romeo", tempmap7);
		
		Map<String, double[]> map2 = new HashMap<>();
		map2.put("Ann Arbor", new double[]{42.280826, -83.743038});
		map2.put("Brighton", new double[]{42.529477, -83.780221});
		map2.put("Detroit", new double[]{42.331427, -83.045754});
		map2.put("Farmington Hills", new double[]{42.482822, -83.418382});
		map2.put("Plymouth", new double[]{42.37309, -83.50202});
		map2.put("Pontiac", new double[]{42.638922, -83.291047});
		map2.put("Romeo", new double[]{42.802808, -83.012987});
		map2.put("Romulus", new double[]{42.24115, -83.612994});
		map2.put("Royal Oak", new double[]{42.48948, -83.144648});
		map2.put("Sterling Heights", new double[]{42.580312, -83.030203});
		
		
		System.out.println("result = " + solutions(map2.size(),"Ann Arbor" ,"Detroit" ,map1, map2));
		
	}
	public static double solutions(int num, String start, String end,Map<String, Map<String, Double>> map1, Map<String, double[]> map2) {
		double res = Integer.MAX_VALUE;
		Map<String, Double> distanceToNow = new HashMap<>();
		TreeMap<Double, String> treemap = new TreeMap<>();
		double firstnum1 = 0;
		double firstnum2 = getDistance(map2.get(start)[0], map2.get(start)[1], 
				map2.get(end)[0], map2.get(end)[1]);
		double firstsum = firstnum1 + firstnum2;
		treemap.put(firstsum, start);
		distanceToNow.put(start, 0.0);
		while(!treemap.isEmpty()) {
			Entry<Double, String> entry = treemap.firstEntry();
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			System.out.println("entry = "+entry.getKey()+ ":"+entry.getValue());
			double now = entry.getKey();
			if(now >= res) {
				treemap.remove(now);
				continue;
			}
			
			String name = entry.getValue();
			
			double toNow = distanceToNow.get(name);
			Map<String, Double> nextPlace = map1.get(name);
			System.out.println("nextPlace size = " + nextPlace.size());
			for(Map.Entry<String, Double> tempEntry: nextPlace.entrySet()) {
				String tempName = tempEntry.getKey();
				double num1 = tempEntry.getValue();
				System.out.println("tempEntry = "+tempEntry.getKey()+ ":"+tempEntry.getValue());
				double sum1 = toNow + num1;
				if(distanceToNow.containsKey(tempName)) {
					continue;
				}else {
					if(tempName.equals(end)) {
						System.out.println(111);
						if(sum1 < res) {
							res = sum1;
						}
						continue;
					}else {
						System.out.println(222);
						distanceToNow.put(tempName, sum1);
						treemap.put(sum1 + getDistance(map2.get(tempName)[0], map2.get(tempName)[1], 
								map2.get(end)[0],map2.get(end)[1]), tempName);
					}
				}
			}
			treemap.remove(now);
		}
		return res;
		
	}
	public static double getDistance(double lat1, double longti1, double lat2, double longti2) {
		double[] arr1 = getRectangularCoordinate(lat1, longti1);
		double[] arr2 = getRectangularCoordinate(lat2, longti2);
//		output(arr1);
//		output(arr2);
		return Math.sqrt(Math.pow(arr1[0] - arr2[0], 2) + Math.pow(arr1[1] - arr2[1], 2) + Math.pow(arr1[2] - arr2[2], 2));
	}
	public static double[] getRectangularCoordinate(double lat, double longti) {
		double[] res = new double[3];
		res[0] = Math.cos((lat/180)*Math.PI) * Math.cos((longti/180)*Math.PI) * 3959;
		res[1] = Math.cos((lat/180)*Math.PI) * Math.sin((longti/180)*Math.PI) * 3959;
		res[2] = Math.sin((lat/180)*Math.PI) * 3959;
		return res;
	}
	public static void output(double[] arr) {
		System.out.println("arr[0] = " + arr[0]);
		System.out.println("arr[1] = " + arr[1]);
		System.out.println("arr[2] = " + arr[2]);
	}

}
