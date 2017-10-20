/*input
3 3
2 4 5
5 1 2 
3 4 5
*/

import java.util.Scanner;

public class StevenMai_238 {

	static void print(int[][] a) {
		for (int[] b : a) {
			for (int c : b)
				System.out.printf("%d ", c);
			System.out.println();
		}
	}

	static void maxSums(int[][] a) {
		if (a.length==0) return;
		if (a[0].length==0) return;

		int N = a.length;
		int M = a[0].length;

		int[] rsums = new int[N];
		int[] csums = new int[M];

		for (int r = 0; r < N; ++r) {
			rsums[r] = 0;
			for (int c = 0; c < M; ++c)
				rsums[r] += a[r][c];
		}

		for (int c = 0; c < M; ++c) {
			csums[c] = 0;
			for (int r = 0; r < N; ++r)
				csums[c] += a[r][c];
		}

		for (int i = 0; i < N; ++i) 
			for (int j = 0; j < M; ++j) 
				a[i][j] = Math.max(rsums[i], csums[j]);
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[][] a = new int[N][M];
		for (int i = 0; i < N; ++i) 
			for (int j = 0; j < M; ++j) 
				a[i][j] = scan.nextInt();
		maxSums(a);
		print(a);
		scan.close();
	}
}