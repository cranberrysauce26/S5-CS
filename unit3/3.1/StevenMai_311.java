
import java.util.*;

public class StevenMai_311 {

	static double termArithm(double term, double diff, int n) {
		return n==1 ? term : diff + termArithm(term, diff, n-1);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double firstTerm = scan.nextDouble(), diff = scan.nextDouble();
		int n = scan.nextInt();
		System.out.println(termArithm(firstTerm, diff, n));
		scan.close();
	}
}