/*input
4 4 6
*/
import java.util.*;

public class StevenMai_A21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int S = scan.nextInt();
		System.out.println(Math.max(0, Math.min(N, S-1) - Math.max(1, S-M) + 1));
		scan.close();
	}
}