/*input
12 25 48
*/
import java.util.*;

public class StevenMai_A21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int S = scan.nextInt();
		System.out.println(Math.max(0, Math.min(N, S) - Math.max(0, S-M) + 1));
		scan.close();
	}
}