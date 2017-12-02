/*input
abcd
deaq
*/
import java.util.*;

public class StevenMai_254 {

	static String appearInOne(String a, String b) {
		boolean[] inA = new boolean[256];
		boolean[] inB = new boolean[256];
		for (int i = 0; i < a.length(); ++i) inA[a.charAt(i)] = true;
		for (int i = 0; i < a.length(); ++i) inB[b.charAt(i)] = true;
		String s = new String();
		for (char i = 0; i < 256; ++i) 
			if (inA[i]^inB[i]) s += i;
		return s;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String a = scan.next(); String b = scan.next();
        
        System.out.println(appearInOne(a,b));
        scan.close();
	}
}