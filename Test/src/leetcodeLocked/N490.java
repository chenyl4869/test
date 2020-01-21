package leetcodeLocked;

public class N490 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] maze = {{0,0,0,0,1,0,0},{0,0,1,0,0,0,0},{0,0,0,0,0,0,0},
				{0,0,0,0,0,0,1},{0,1,0,0,0,0,0},{0,0,0,1,0,0,0},{0,0,0,0,0,0,0},{0,0,1,0,0,0,1}, {0,0,0,0,1,0,0}
							};
		int[] start	= {0, 0};
		int[] end = {8, 6};
		
		int[][] maze2 = {{0,0,1,0,0},{0,0,0,0,0},{0,0,0,1,0},{1,1,0,1,1},{0,0,0,0,0}};
		int[] start2 = {0,4};
		int[] end2 = {3,2};
		System.out.println(hasPath(maze2, start2, end2));

	}
	public static boolean hasPath(int[][] maze, int[] start, int[] destination) {
		if(maze == null || maze.length == 0 || maze[0].length == 0) {
			return false;
			
		}
		int[][] visited = new int[maze.length][maze[0].length];
		boolean a = false;
		a = DFS(maze, visited, 0, 1, start[0], start[1], destination[0], destination[1]);
		System.out.println("a1 ======== "+a);
		if(a == true) {
			return true;
		}
		visited[start[0]][start[1]] = 0;
		a = DFS(maze, visited, 0, -1, start[0], start[1], destination[0], destination[1]);
		System.out.println("a2 ======== "+a);
		if(a == true) {
			return true;
		}
		visited[start[0]][start[1]] = 0;
		a = DFS(maze, visited, 1, 0, start[0], start[1], destination[0], destination[1]);
		System.out.println("a3 ======== "+a);
		if(a == true) {
			return true;
		}
		visited[start[0]][start[1]] = 0;
		a = DFS(maze, visited, -1, 0, start[0], start[1], destination[0], destination[1]);
		System.out.println("a4 ======== "+a);
		if(a == true) {
			return true;
		}
		return false;
		
	}
	public static boolean DFS(int[][] maze, int[][] visited, int dirX, int dirY, int x, int y, int dx, int dy) {
		
		System.out.println("x = "+x+", y = "+y);
		//System.out.println("dirX = "+dirX+", dirY = "+dirY);
//		if(x == dx && y == dy ) {
//			if(dirX != 0) {
//				if(x + dirX < 0 || x + dirX >= maze.length) {
//					return true;
//				}
//				if(maze[x + dirX][y] == 1) {
//					return true;
//				}
//				return false;
//			}
//			if(dirY != 0) {
//				if(y + dirY < 0 || y + dirY >= maze[0].length) {
//					return true;
//				}
//				if(maze[x][y+dirY] == 1) {
//					return true;
//				}
//				return false;
//			}
//			return false;
//		}
		if(visited[x][y] == 1) {
			return false;
		}
//		visited[x][y] = 1;
		int nextX = x + dirX;
		int nextY = y + dirY;
		System.out.println("nextX = "+nextX + ", nextY = "+nextY);
		if(nextX < 0 || nextX >= maze.length || nextY < 0 || nextY >= maze[0].length || maze[nextX][nextY] == 1) {
			visited[x][y] = 1;
			if(x == dx && y == dy) {
				return true;
			}
			int nextDX = x + dirY;// 0 + -1
			int nextDY = y + dirX;// 3 + 0
			System.out.println("nextDX = "+nextDX + ", nextDY = "+nextDY);
			boolean a = false;
			if(!(nextDX < 0 || nextDX >= maze.length || nextDY < 0 || nextDY >= maze[0].length || maze[nextDX][nextDY] == 1)) {
				System.out.println(111);
				a = DFS(maze, visited, dirY, dirX, nextDX, nextDY, dx, dy);
				
			}
			if(a == true) {
				System.out.println(222);
				return true;
			}
			if(dirY != 0) {
				dirY = -dirY;
				nextDX = x + dirY;
			}
			if(dirX != 0) {
				dirX = -dirX;
				nextDY = y + dirX;
			}
			System.out.println("nextDX = "+nextDX + ", nextDY = "+nextDY);
			if(!(nextDX < 0 || nextDX >= maze.length || nextDY < 0 || nextDY >= maze[0].length || maze[nextDX][nextDY] == 1)) {
				System.out.println(333);
				a = DFS(maze, visited, dirY, dirX, nextDX, nextDY, dx, dy);
				
			}
			if(a == true) {
				System.out.println(444);
				return true;
			}
			//visited[x][y] = 0;
			return false;
		}
		//visited[x][y] = 0;
		return DFS(maze, visited, dirX, dirY, nextX, nextY, dx, dy);
	}

}
