/*input
4
*/
import java.util.*;

public class StevenMai_318 {

	
	static void printBottomCorner(int n) {
		if (n==0) return;
		printBottomCorner(n-1);
		for (int i = 0; i < n; ++i) System.out.print("* ");
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		printBottomCorner(n);
		scan.close();
	}
}