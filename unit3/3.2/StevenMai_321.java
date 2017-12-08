/*input
3 3
1 0 1
0 0 0
0 1 1
1 0
*/
import java.util.*;

public class StevenMai_321 {

	static int dfs(int x, int y, int[][] minefield) {
		// check out of bounds
		if (x<0 || x >= minefield.length) return 0;
		if (y<0 || y >= minefield[x].length) return 0;
		// check if not visited and not mined
		if (minefield[x][y]!=0) return 0;
		// visit
		minefield[x][y] = 2;
		return 1+dfs(x-1,y,minefield)+dfs(x+1,y,minefield)+dfs(x,y-1,minefield)+dfs(x,y+1,minefield);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt(), M = scan.nextInt();
		int[][] minefield = new int[N][M];
		for (int i = 0; i < N; ++i)
			for (int j = 0; j < M; ++j) minefield[i][j] = scan.nextInt();
		int x = scan.nextInt(), y = scan.nextInt();
		int cnt = dfs(x,y, minefield);
		System.out.println(cnt);
	}
}