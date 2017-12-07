/*input
343 7
*/
import java.util.*;

public class StevenMai_313{

	static boolean isPower(int n, int base) {
		if (n==1) return true;
		if (n % base != 0) return false;
		return isPower(n/base, base);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(), base = scan.nextInt();
		System.out.println(isPower(n, base));
		scan.close();
	}
}