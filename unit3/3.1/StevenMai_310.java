
import java.util.*;

public class StevenMai_310 {

	static long fact(int n) {return n==0 ? 1 : n * fact(n-1);}

	static int gcd(int a, int b) {return b==0 ? a : gcd(b, a%b);}

	public static void main(String[] args) {
		System.out.println(gcd(345, 54));
	}
}