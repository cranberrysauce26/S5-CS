/*input
3
2 4 5
5 1 2 
3 4 15
*/

import java.util.Scanner;

public class StevenMai_237 {

	static void print(int[][] a) {
		for (int[] b : a) {
			for (int c : b)
				System.out.printf("%d ", c);
			System.out.println();
		}
	}

	static void transpose(int[][] a) {
		int N = a.length;
		for (int i = 0; i + 1 < N; ++i) {
			for (int j = i+1; j < N; ++j) {
				int tmp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = tmp;
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[][] a = new int[N][N];
		for (int i = 0; i < N; ++i) 
			for (int j = 0; j < N; ++j) 
				a[i][j] = scan.nextInt();
		
		transpose(a);
		print(a);
		scan.close();
	}
}