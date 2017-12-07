/*input
John Loves Mary END
*/
import java.util.*;

public class StevenMai_317 {

	
	static void reverseStory(Scanner kbd) {
		String word = kbd.next();
		if (word.equals("END")) System.out.println();
		else {
			reverseStory(kbd);
			System.out.printf("%s ", word);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		reverseStory(scan);
		scan.close();
	}
}