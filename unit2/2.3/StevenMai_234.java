/*input
5
*/
import java.util.Scanner;

public class StevenMai_234 {

	static void print(int[][] a) {
		for (int[] b : a) {
			for (int c : b)
				System.out.printf("%d ", c);
			System.out.println();
		}
	}

	static void cross(int[][] p) {
		int N = p.length;
		for (int i = 1; i <= N; ++i) 
			for (int j = 1; j <= N; ++j) 
				p[i-1][j-1] = (i==j || i+j==N+1) ? 1 : 0;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[][] p = new int[N][N];
		cross(p);
		print(p);
		scan.close();
	}
}