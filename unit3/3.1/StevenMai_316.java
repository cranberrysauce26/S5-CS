/*input
5 2 7 0
*/
import java.util.*;

public class StevenMai_316 {

	
	static void reverseSequence(Scanner kbd) {
		int n = kbd.nextInt();
		if (n==0) System.out.println();
		else {
			reverseSequence(kbd);
			System.out.printf("%d ", n);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		reverseSequence(scan);
		scan.close();
	}
}