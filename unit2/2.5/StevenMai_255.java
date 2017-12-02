/*input
hpqurlle
pwrstuvabcf
2
*/
import java.util.*;
public class StevenMai_255 {

	static String encode(String s, String key, int shift) {
		String ans = "";
		shift %= key.length();
		char[] res = new char[256];
		for (char i = 0; i < 256; ++i) res[i] = i;
		for (int i = key.length()-1; i >= 0; --i) 
			res[key.charAt(i)] = key.charAt((i+shift+key.length())%key.length());
		for (int i = 0; i < s.length(); ++i) ans += res[s.charAt(i)];
		return ans;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next(); String key = scan.next();
		int shift = scan.nextInt();
		System.out.println(encode(s, key, shift));
		scan.close();
	}
}