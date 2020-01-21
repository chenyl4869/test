package training;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DFS_4Coins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = {25,10,5,1};
		int[] temp = new int[4];
		List<int[]> res = new ArrayList<>();
		DFS(90, coins, temp, res, 0);
		Iterator<int[]> iterator = res.iterator();
		while(iterator.hasNext()) {
			int[] tempres = iterator.next();
			for(int i=0;i<4;i++) {
				//System.out.println(tempres[i]);
			}
			//System.out.println();
		}
	}
	public static void DFS(int money, int[] coins, int[] temp, List<int[]> res, int level) {
		if(level==4) {
			if(money == 0) {
				res.add(temp);
				for(int i=0;i<4;i++) {
					System.out.println(temp[i]);
				}
				System.out.println();
			}
			
			return;
		}
		for(int i = 0; i*coins[level]<=money; i++) {
			temp[level] = i;
			DFS(money-i*coins[level], coins, temp, res, level+1);
		}
	}
}
