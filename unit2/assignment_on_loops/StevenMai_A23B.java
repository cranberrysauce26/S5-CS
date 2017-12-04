/*input
53 31
*/
import java.util.*;

public class StevenMai_A23B {

	static void recurse(int t1, int t2, Queue<Integer> q) {
		if (t1-t2<0) System.out.println(q.size());
		else{
			q.add(t1-t2);
			recurse(t2, t1-t2, q);
			System.out.printf("%d ", q.poll());
		} 
	}

	static void display(int t1, int t2) {
		Queue<Integer> q = new ArrayDeque<Integer>();
		q.add(t1); q.add(t2);
		recurse(t1, t2, q);
		System.out.printf("%d %d\n", q.poll(), q.poll());
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t1 = scan.nextInt(), t2 = scan.nextInt();
		display(t1, t2);
		scan.close();
	}
}