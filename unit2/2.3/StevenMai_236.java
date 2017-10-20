/*input
2
*/
import java.util.Scanner;

public class StevenMai_236 {

	static void rprint(int[][] a) {
		for (int r = a.length-1; r >= 0; --r) {
			for (int c = 0; c < a[r].length; ++c)
				System.out.printf("%d ", a[r][c]);
			System.out.printf("\n");
		}
	}

	static void chess(int[][] p) {
		for (int i = 1; i <= p.length; ++i) 
			for (int j = 1; j <= p[i-1].length; ++j) 
				p[i-1][j-1] = (i&1)^(j&1);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[][] p = new int[N][N];
		chess(p);
		rprint(p);
		scan.close();
	}
}