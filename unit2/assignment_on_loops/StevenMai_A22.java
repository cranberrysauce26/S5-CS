/*input
7 3
*/
import java.util.*;

public class StevenMai_A22 {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int D = scan.nextInt(), Z = scan.nextInt();
		// cnt is the number of such numbers. We initially set it to zero
		int cnt = 0; 

		// end is first integer with more than D digits. This is 10^D
		int end = 1; 
		for (int i = 0; i < D; ++i) end *= 10;

		// factor is 10^Z. 
		int factor = 1;
		for (int i = 0; i < Z; ++i) factor *= 10;

		// We are iterating over all D digit numbers x
		// Notice that the first D digit number is end / 10
		for (int x = end/10; x < end; ++x) {
			int prod = x*(x-1);
			// we need prod to be divisible by factor but not by factor*10
			if (prod % factor==0 && prod % (10*factor) != 0) ++cnt;
		}

		System.out.println(cnt);
		scan.close();
	}
}