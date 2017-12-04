/*input
53 31
*/
import java.util.Scanner;

public class StevenMai_A23 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T1 = scan.nextInt(), T2 = scan.nextInt();
		int n=2;
		for (;T1-T2>=0; ++n) {
			int tmp = T1-T2;
			T1 = T2;
			T2 = tmp;
		}
		System.out.println(n);
		scan.close();
	}
}