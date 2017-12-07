/*input
hooray
*/
import java.util.*;

public class StevenMai_3111 {
	static String reverseString(String word) {
		int N = word.length();
		if (N<=1) return word;
		return reverseString(word.substring(N/2)) + reverseString(word.substring(0, N/2));
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		System.out.println(reverseString(word));
		scan.close();
	}
}