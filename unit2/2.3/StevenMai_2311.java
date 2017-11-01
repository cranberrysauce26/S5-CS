import java.util.Scanner;
public class StevenMai_2311 {

	static int[] readSpiral(int[][] a) {
		int N = a.length;
		int[] b = new int[N*N];
		for (int d = N-1, i=0, j=0, v=N*N; d >= 0; d-=2, ++i, ++j) {
			if (d==0) b[--v] = a[i][j];
			for (int k = 0; k < d; ++k, ++j) b[--v] = a[i][j];
			for (int k = 0; k < d; ++k, ++i) b[--v] = a[i][j];
			for (int k = 0; k < d; ++k, --j) b[--v] = a[i][j];
			for (int k = 0; k < d; ++k, --i) b[--v] = a[i][j];
		}
		return b;
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
		System.out.println();
		scan.close();
	}
}