/*input
1 10
*/
import java.util.Scanner;

public class StevenMai_233 {

	static void print(int[][] a) {
		for (int[] b : a) {
			for (int c : b)
				System.out.printf("%d ", c);
			System.out.println();
		}
	}

	static void products(int[][] p) {
		for (int i = 1; i <= p.length; ++i) 
			for (int j = 1; j <= p[i-1].length; ++j) 
				p[i-1][j-1] = i*j;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[][] p = new int[N][M];
		products(p);
		print(p);
		scan.close();
	}
}