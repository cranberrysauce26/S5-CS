/*input
79 130
*/
import java.util.*;

public class StevenMai_A23B {

	/*
		This method simply displays the sequence.
		It is essentially the same as the solution to the previous problem,
		so just refer to that one.
	*/

	static void display(int t1, int t2) {
		System.out.printf("%d %d ", t1, t2);
		while (t1-t2 >= 0) {
			int tmp = t1-t2;
			t1 = t2;
			t2 = tmp;
			System.out.printf("%d ", t2);
		}
		System.out.println();
	}

	/*
		This method returns the length of the sequence.
		It uses the property that for n > 2,
		T(n) = (-1)^n (f(n-2) * T(2) - f(n-3) * T(1))

		where f(n) is the n'th term of the fibonnaci sequence, zero indexed.

		Specifically, f(0) = f(1) = 1, and f(n) = f(n-1)+f(n-2) for all n > 1.

		This can be easily shown through induction.

		We therefore maintain that at the start of the for loop
		f1 and f2 are f(n-3) and f(n-2) respectively.

		Furthermore, we maintain that at the start of the for loop, sign = (-1)^n.

		This means that T(n) = sign*(f2*t2-f1*t1).
		We iterate as long as T(n) >= 0, and we update f1 and f2 after each loop accordingly.
		
		Finally we return n-1 because T(n) is the first negative term.
	*/

	static int getLength(int t1, int t2) {
		int f1 = 1, f2 = 1, n=3, sign=-1;
		for (; sign*(f2*t2-f1*t1) >= 0; ++n, sign*=-1) {
			int tmp = f1+f2;
			f1 = f2;
			f2 = tmp;
		}
		return n-1;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t1 = scan.nextInt(), t2 = scan.nextInt();
		System.out.println(getLength(t1, t2));
		display(t1, t2);
		scan.close();
	}
}