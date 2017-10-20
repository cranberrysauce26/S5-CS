/*input
3 2
2 4 5
5 1 2 
3 4 5
*/

import java.util.Scanner;

public class StevenMai_238 {

	static void print(char[][] a) {
		for (char[] b : a) {
			for (char c : b)
				System.out.printf("%c ", c);
			System.out.println();
		}
	}

	static char[][] scale(char[][] a, int k) {
		int N = a.length;
		char[][] b = new char[N*k][N*k];
		for (int i = 0; i < N*k; ++i) 
			for (int j = 0; j < N*k; ++j) 
				b[i][j] = a[i/k][j/k];
		return b;
	}

	public static void main(String[] args) {

		char[][] a = {
			{'a', 'b', 'c'},
			{'e', 'f', 'g'},
			{'x', 'y', 'z'}
		};

		int k = 2;
		
		char[][] b = scale(a, k);
		print(b);
	}
}