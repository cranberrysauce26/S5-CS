/*input
haaakjkjk
j
*/
import java.util.*;

public class StevenMai_251 {

	static int numberOf(String s, char ch) {
		int cnt = 0;
		for (int i = 0; i < s.length(); ++i) 
			if (s.charAt(i)==ch) ++cnt;
		return cnt;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String s = scan.next();
		String chString = scan.next();

		System.out.println(numberOf(s, chString.charAt(0)));
		scan.close();
	}
}