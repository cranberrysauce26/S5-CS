/*input
2 3
hello world cool
fire ice water
*/
import java.util.*;
public class StevenMai_243 {

	// This method is not necessary if we are allowed to use Collections.shuffle
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

	static void shuffle(String[][] A) {
		int N = A.length;
		if (N==0) return; // If A is empty then you can only shuffle one way
		int M = A[0].length; // assume all strings A[i] are of equal length M

		List<String> B = new ArrayList<String>();
		for (int i = 0; i < N; ++i) 
			for (int j = 0; j < M; ++j) B.add(A[i][j]);
		shuffleList(B); // We can also use Collections.shuffle(B)
		for (int i = 0; i < N; ++i)
			for (int j = 0; j < M; ++j) A[i][j] = B.get(i*M+j);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		String[][] plan = new String[N][M];
		for(int i = 0; i < N; ++i) 
			for (int j = 0; j < M; ++j) plan[i][j] = scan.next();

		shuffle(plan);
		for(int i = 0; i < N; ++i) {
			for (int j = 0; j < M; ++j) {
				System.out.print(plan[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
		scan.close();
	}
}