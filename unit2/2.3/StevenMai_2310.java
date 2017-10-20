/*input
19
*/
import java.util.Scanner;
public class StevenMai_2310 {

	static void print(int[][] a) {
		for (int[] b : a) {
			for (int c : b)
				System.out.printf("%d ", c);
			System.out.println();
		}
	}

	static void fillSpiral(int[][] a) {
		int N = a.length;

		for (int d = N-1, i=0, j=0, v=1; d >= 0; d-=2, ++i, ++j) {
			if (d==0) a[i][j]=v;
			for (int k = 0; k < d; ++k, ++j, ++v) a[i][j]=v;
			for (int k = 0; k < d; ++k, ++i, ++v) a[i][j] = v;
			for (int k = 0; k < d; ++k, --j, ++v) a[i][j] = v;
			for (int k = 0; k < d; ++k, --i, ++v) a[i][j] = v;
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		if (N%2==0) {
			System.out.println("Error you must enter an odd number\nReturning\n");
			return;
		}
		int[][] a = new int[N][N];
		fillSpiral(a);
		print(a);
		scan.close();
	}
}