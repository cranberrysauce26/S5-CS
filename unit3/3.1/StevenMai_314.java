/*input
0
*/
import java.util.*;

public class StevenMai_314{

	static int digitSum(int n) {
		return n < 10 ? n : n%10 + digitSum(n/10);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(digitSum(n));
		scan.close();
	}
}