package leetcode;

import java.util.HashSet;
import java.util.Set;

public class N36_ValidSudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean isValidSudoku(char[][] board) {
        if(board == null || board.length!=9) {
        	return false;
        }
        for(int i=0;i<board.length;i++) {
        	if(board[i]==null || board[i].length!=9) {
        		return false;
        	}
        }
        Set<Character> numbers = new HashSet<>();
        numbers.add('1');
        numbers.add('2');
        numbers.add('3');
        numbers.add('4');
        numbers.add('5');
        numbers.add('6');
        numbers.add('7');
        numbers.add('8');
        numbers.add('9');
        
        Set<Character> x = new HashSet<>();
        for(int i = 0;i<9;i++) {
        	x.removeAll(x);
        	for(int j=0;j<9;j++) {
        		if(board[i][j]=='.') {
        			continue;
        		}
        		if(!numbers.contains(board[i][j]) || x.contains(board[i][j])) {
        			return false;
        		}
        		x.add(board[i][j]);
        	}
        }
        for(int j=0;j<9;j++) {
        	x.removeAll(x);
        	for(int i=0;i<9;i++) {
        		if(board[i][j]=='.') {
        			continue;
        		}
        		if(!numbers.contains(board[i][j]) || x.contains(board[i][j])) {
        			return false;
        		}
        		x.add(board[i][j]);
        	}
        }
        for(int i=0;i<9;i=i+3){
        	for(int j=0;j<9;j=j+3){
//        		int tempi = i;
//        		int tempj = j;
        		x.removeAll(x);
        		for(int tempi=i;tempi<i+3;tempi++) {
        			for(int tempj = j;tempj<j+3;tempj++) {
        				if(board[tempi][tempj]=='.') {
                			continue;
                		}
        				if(!numbers.contains(board[tempi][tempj]) || x.contains(board[tempi][tempj])) {
        					return false;
        				}
        				x.add(board[tempi][tempj]);
            		}
        		}
        	}
        }
        return true;
    }


}
