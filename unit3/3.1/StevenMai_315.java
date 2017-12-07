/*input
254
*/
import java.util.*;

public class StevenMai_315{

	static int digitSum(int n) {
		return n < 10 ? n : n%10 + digitSum(n/10);
	}

	static int digitalRoot(int n) {
		if (n < 10) return n;
		return digitalRoot(digitSum(n));
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(digitalRoot(n));
		scan.close();
	}
}