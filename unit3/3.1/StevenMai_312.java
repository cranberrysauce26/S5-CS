/*input
1.0 2.0 4
*/
import java.util.*;

public class StevenMai_312 {

	static double sumGeom(double term, double ratio, int n) {
		return n == 1 ? term :  ratio * sumGeom(term, ratio, n-1) + term;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double firstTerm = scan.nextDouble(), ratio = scan.nextDouble();
		int n = scan.nextInt();
		System.out.println(sumGeom(firstTerm, ratio, n));
		scan.close();
	}
}