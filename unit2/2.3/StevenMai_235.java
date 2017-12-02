/*input
4
*/
import java.util.Scanner;

public class StevenMai_235 {

	static void print(int[][] a) {
		for (int[] b : a) {
			for (int c : b)
				System.out.printf("%d ", c);
			System.out.println();
		}
	}

	static void triangles(int[][] p) {
		int N = p.length;
		for (int i = 0, a = 0, b = N-1; i < N; ++i, ++a, --b) 
			for (int j = 0; j < N; ++j) p[i][j] = ( (a <= j && j <= b) || (b <= j && j <= a) ) ? 1 : 0;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[][] p = new int[N][N];
		triangles(p);
		print(p);
		scan.close();
	}
}