/*input
1.0 2.0 4
*/
import java.util.*;

public class StevenMai_312 {

	// way 1. Complexity O(N)

	static double sumGeom(double term, double ratio, int n) {
		return n == 1 ? term :  ratio * sumGeom(term, ratio, n-1) + term;
	}

	// way 2. Complexity O(lg N)

	static double pow(double b, int e) {
		if (e==0) return 1;
		double half = pow(b, e/2);
		return e%2==0 ? half*half : half*half*b;
	}
	static double sumGeom2(double term, double ratio, int n) {
		return term * (pow(ratio, n)-1)/(ratio-1);
	}

	// way 3. Complexity O(lg N)

	public static class ANS {
		public ANS(double a, double b) {this.sum = a; this.pow = b;}
	    public double sum;
	    public double pow;
	}

	static ANS sumGeom3(double term, double ratio, int n) {
		if (n==1) return new ANS(term, ratio);
		if (n%2==0) {
			ANS a = sumGeom3(term, ratio, n/2);
			return new ANS(a.sum * (a.pow+1), a.pow*a.pow);
		} 
		ANS a = sumGeom3(term, ratio, n-1);
		return new ANS(ratio*a.sum+term, a.pow*a.pow*ratio);
	}

	// main method

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double firstTerm = scan.nextDouble(), ratio = scan.nextDouble();
		int n = scan.nextInt();
		System.out.println(sumGeom(firstTerm, ratio, n));
		System.out.println(sumGeom2(firstTerm, ratio, n));
		System.out.println(sumGeom3(firstTerm, ratio, n).sum);
		scan.close();
	}
}