/*input
3 2
*/
import java.util.*;

public class StevenMai_326 {

	static int distributions(int n, int m) {
		if (m==1) return 1;
		int cnt = 0;
		for (int k = 0; k * m <= n; ++k) cnt += distributions(n-k*m, m-1);
		return cnt;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(), m = scan.nextInt();
		System.out.println(distributions(n, m));
		scan.close();
	}
}