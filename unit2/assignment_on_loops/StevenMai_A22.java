/*input
7 3
*/
import java.util.*;

public class StevenMai_A22 {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int D = scan.nextInt(), Z = scan.nextInt();

		int cnt = 0;

		int end = 1;
		for (int i = 0; i < D; ++i) end *= 10;

		int factor = 1;
		for (int i = 0; i < Z; ++i) factor *= 10;

		for (int x = end/10; x < end; ++x) {
			int prod = x*(x-1);
			if (prod % factor==0 && prod % (10*factor) != 0) ++cnt;
		}

		System.out.println(cnt);
		scan.close();
	}
}