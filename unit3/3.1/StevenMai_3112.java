import java.util.*;

public class StevenMai_3112 {
	static long fact(int n) {return n==0 ? 1 : n * fact(n-1);}

	// Choose LOG so that 2^LOG is gauranteed to give you an error
	// 2^25 is very large and will almost certainly give a stack overflow error
	static final int LOG = 25; 

	public static void main(String[] args) {
		int x = 0;
		for (int k = LOG; k >= 0; --k) {
			try {
				fact(x += (1<<k));
			} catch(StackOverflowError e) {
				x -= (1<<k);
			}
		}
		System.out.println(x);
	}
}