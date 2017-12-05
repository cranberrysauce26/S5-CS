/*input
53 31
*/
import java.util.*;

public class StevenMai_A23B {
	/*
		This function takes the previous two terms t1 and t2 respectively
		as well as the length n of the current array.

		We initially call it with recurse(T(1), T(2), 2).

		Then we continue calling it as long as we can extend the length 
		of the sequence. Specifically, we call recurse(t2, t1-t2, n+1).

		If we encounter a negative term, then we create a new array of length n and 
		set the last term to t2.
	
		Otherwise, we get the array returned from recurse(t2, t1-t2, n+1)
		and set the n-2 and n-1 terms to t1 and t2 respectively 

		Then we return the array.
	*/
	static int[] recurse(int t1, int t2, int n) {
		int[] arr;
		if (t1-t2 >=0) arr = recurse(t2, t1-t2, n+1);
		else {
			System.out.printf("%d\n", n);
			arr = new int[n];
		}
		arr[n-1] = t2;
		arr[n-2] = t1;
		return arr;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t1 = scan.nextInt(), t2 = scan.nextInt();
		int[] arr = recurse(t1, t2, 2);
		for (int x : arr) System.out.printf("%d ", x);
		System.out.println();
		scan.close();
	}
}