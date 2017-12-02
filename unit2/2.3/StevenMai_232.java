/*input
3
2 4 12
5 1 2 3 4 16
2 3 6
*/

import java.util.Scanner;

public class StevenMai_232 {

	static int minmax(int[][] a) {
		int ans = Integer.MAX_VALUE;
		for (int[] b : a) {
			int hi = Integer.MIN_VALUE;
			for (int c : b)
				if (c > hi) hi = c;
			if (hi < ans) ans = hi;
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt(); // The number of rows
		int[][] a = new int[N][];
		for (int i = 0; i < N; ++i) {
			int M = scan.nextInt();
			a[i] = new int[M]; // The number of columns in row
			for (int j = 0; j < M; ++j) 
				a[i][j] = scan.nextInt();
		}
		System.out.printf("%d\n", minmax(a));
		scan.close();
	}
}