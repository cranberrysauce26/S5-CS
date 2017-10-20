/*input
3
2 4 5
5 1 2 3 4 5
1 3
*/

import java.util.Scanner;

public class StevenMai_231 {

	static void print(int[][] a) {
		for (int[] b : a) {
			for (int c : b)
				System.out.printf("%d ", c);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[][] a = new int[N][];
		for (int i = 0; i < N; ++i) {
			int M = scan.nextInt();
			a[i] = new int[M];
			for (int j = 0; j < M; ++j) 
				a[i][j] = scan.nextInt();
		}
		print(a);
		scan.close();
	}
}