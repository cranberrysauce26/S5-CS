/*input
kayaks
*/
import java.util.Scanner;
public class WordPlay {
	static boolean isPalindrome(String str) {
		for (int l = 0, r = str.length()-1; l<r; ++l, --r) 
			if (str.charAt(l) != str.charAt(r)) return false;
		return true;
	}
	static String reverse(String str) {
		String ret = new String();
		for (int i = str.length()-1; i>=0; --i) ret += str.charAt(i);
		return ret;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		if (isPalindrome(s)) System.out.printf("Your string is a palindrome\n");
		else System.out.printf("Your string isn't a palindrome\n");

		System.out.println("Here's your reversed string:");
		System.out.println(reverse(s));
	}
}