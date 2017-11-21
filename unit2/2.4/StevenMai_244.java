/*input
5 3
hello car bob sky dagger
*/
import java.util.*;
public class StevenMai_244 {

	public static void shuffleList(List<String> a) {
        int n = a.size();
        Random random = new Random();
        random.nextInt();
        for (int i = 0; i < n; i++) {
            int j = i + random.nextInt(n - i);
            String tmp = a.get(i);
            a.set(i, a.get(j));
            a.set(j, tmp);
        }
    }

	static String[] getSample(String[] A, int n) {
		List<String> B = Arrays.asList(A);
		shuffleList(B); // or Collections.shuffle(B);
		String[] C = new String[n];
		for (int i = 0; i < n; ++i) C[i] = B.get(i);
		return C;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int n = scan.nextInt();
		String[] names = new String[N];
		for (int i =0; i < N; ++i) names[i] = scan.next();

		String[] sample = getSample(names, n);

		for (String s : sample) {System.out.print(s); System.out.printf(" ");}
		scan.close();
	}
}