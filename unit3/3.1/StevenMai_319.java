/*input
4
*/
import java.util.*;

public class StevenMai_319 {

	
	static void printTopCorner(int n) {
		if (n==0) return;
		for (int i = 0; i < n; ++i) System.out.print("* ");
		System.out.println();
		printTopCorner(n-1);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		printTopCorner(n);
		scan.close();
	}
}