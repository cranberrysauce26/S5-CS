/*input
hello world
*/
import java.util.*;

public class LetterCounter {
	static final char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

	
	static int countVowels(String s) {
		int cnt=0;
		for (int i = 0; i < s.length(); ++i) 
			if (Character.isLetter(s.charAt(i)))
				for (int j = 0; j < vowels.length; ++j) 
					if (s.charAt(i)==vowels[j]) ++cnt;
		return cnt;
	}

	static int countConsonants(String s) {
		int cnt=0;
		for (int i = 0; i < s.length(); ++i) {
			if (Character.isLetter(s.charAt(i))) {
				boolean found = false;
				for (int j = 0; j < vowels.length && !found; ++j) 
					if (s.charAt(i)==vowels[j]) found = true;
				if (!found) ++cnt;
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		System.out.printf("V: %d\n", countVowels(s));
		System.out.printf("C: %d\n", countConsonants(s));
	}
}