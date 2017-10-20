import java.util.Scanner;
public class StevenMai_2311 {

	static int[] readSpiral(int[][] a) {
		int[] b = new int[a.length];
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[][] a = new int[N][N];
		for (int i = 0; i < N; ++i)
			for (int j = 0; j < N; ++j)
				a[i][j] = scan.nextInt();
		int[] b = readSpiral(a);
		for (int c : b) System.out.printf("%d ", c);
		scan.close();
	}
}