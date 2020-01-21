package leetcode_51_100;

public class N79_WordSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean exist(char[][] board, String word) {
        if(board == null || board.length == 0 || board[0].length == 0) {
        	return false;
        }
        int m = board.length;
        int n = board[0].length;
        int[][] visited = new int[m][n];
        boolean res = false;
        for(int i = 0; i < m; i++) {
        	for(int j = 0; j < n; j++) {
        		res = DFS(word, board, visited, 0, i, j, m, n);
        		if(res) {
        			return true;
        		}
        	}
        }
        return false;
    }
	public boolean DFS(String word, char[][] board, int[][] visited ,int level,int row, int col, int m, int n) {
		if(level == word.length()) {
			return true;
		}
		if(row == m || row < 0 || col == n || col < 0) {
			return false;
		}
		if(visited[row][col] == 1) {
			return false;
		}
		if(word.charAt(level) != board[row][col]) {
			return false;
		}
		
		visited[row][col] = 1;
		boolean a = DFS(word, board, visited, level+1, row-1, col, m, n);
		if(a) {
			return true;
		}
		a = DFS(word, board, visited, level+1, row+1, col, m, n);
		if(a) {
			return true;
		}
		a = DFS(word, board, visited, level+1, row, col-1, m, n);
		if(a) {
			return true;
		}
		a = DFS(word, board, visited, level+1, row, col+1, m, n);
		if(a) {
			return true;
		}
		visited[row][col] = 0;
		return false;
	}

}
