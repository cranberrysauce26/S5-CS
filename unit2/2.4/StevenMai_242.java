/*input
happy
3
good
bad
happy
*/
import java.util.*;
public class StevenMai_242 {

	static int menu(String title, String[] items) {
		for (int i = 1; i <= items.length; ++i) 
			if (title.compareTo(items[i-1]) == 0) return i;
		return -1;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String title = scan.next();
		int N = scan.nextInt();
		String[] items = new String[N];
		for(int i =0; i < N; ++i) items[i] = scan.next();
		System.out.println(menu(title, items));
		scan.close();
	}
}