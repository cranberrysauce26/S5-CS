/*input
4 4 3
*/
import java.util.*;

public class StevenMai_A21 {

	/*
		Let's say that the N sided die rolls a.

		Then you need 2 things:

		1. 1 <= a <= N
		2. 1 <= S-a <= M

		Condition 2 is equivalent to
		S-M <= a <= S-1
		
		Therefore combining the two, we have

		max(1, S-M) <= a <= min(N, S-1)

		There are now two cases

		Case 1: max(1, S-M) <= min(N, S-1)

			Then the number of solutions is min(N, S-1) - max(1, S-M) + 1

		Case 2: max(1, S-M) > min(N, S-1)

			Then there are no solutions

		These two cases are summarized in the result below	

		Number of solutions = max(0, min(N, S-1)-max(1, S-M)+1)

	*/

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int S = scan.nextInt();
		System.out.println(Math.max(0, Math.min(N, S-1) - Math.max(1, S-M) + 1));
		scan.close();
	}
}