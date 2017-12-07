/*input
5 2
*/
import java.util.*;

public class StevenMai_3110 {

	static double power(double x, int n) {
		if (n==0) return 1.0;
		double half = power(x, n/2);
		return n%2==0 ? half*half : half*half*x;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x = scan.nextDouble(); 
		int n = scan.nextInt();
		System.out.println(power(x, n));
		scan.close();
	}
}