/*input
79 130
*/
import java.util.*;

public class StevenMai_A23B {

	static void display(int t1, int t2) {
		System.out.printf("%d %d ", t1, t2);
		for (; t1-t2 >= 0;) {
			int tmp = t1-t2;
			t1 = t2;
			t2 = tmp;
			System.out.printf("%d ", t2);
		}
		System.out.println();
	}

	static int getLength(int t1, int t2) {
		int f1 = 1, f2 = 1;

		int n, sign=-1;

		for (n = 3; sign*(f2*t2-f1*t1) >= 0; ++n, sign*=-1) {
			int tmp = f1+f2;
			f1 = f2;
			f2 = tmp;
		}

		/*
			T(n) = -1^n ( f(n-2) * t2 - f(n-3) * t1)

			T(3) = T(1) - T(2)
			T(4) = 2*T(2)-T(1)
			T(5) = 2 t1 - 3 t2

		*/

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