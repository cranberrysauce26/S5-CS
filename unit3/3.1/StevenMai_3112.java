import java.util.*;

public class StevenMai_3112 {
	static long fact(int n) {return n==0 ? 1 : n * fact(n-1);}

	// Choose LOG so that 2^LOG is gauranteed to give you an error
	// 2^25 is very large and will almost certainly give a stack overflow error
	static final int LOG = 25; 

	public static void main(String[] args) {

		/*
			This program does a binary search to find
			the last x such that fact(x) does not result in a stack overflow error.

			We do this by trying to set the first LOG bits of x.
			All the other bits are zero because we are assuming that x < 2^LOG.

			Therefore we try to set the k'th bit. If it does not give us an error,
			we turn that bit on. Otherwise, we leave it off.

			Finally we return x.
		*/

		int x = 0;
		for (int k = LOG-1; k >= 0; --k) {
			try {
				fact(x += (1<<k));
			} catch(StackOverflowError e) {
				x -= (1<<k);
			}
		}
		System.out.println(x);
	}
}