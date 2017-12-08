/*input
9 6
*/
import java.util.Scanner;

public class StevenMai_A23 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		int T1 = scan.nextInt(), T2 = scan.nextInt();
		// n is the number of valid terms found so far
		int n=2;

		// Loop as long as the next term is valid
		for (;T1-T2>=0; ++n) 
		{
			// Update T1 and T2
			// We maintain the invariant that T1 = T(n-1), T2 = T(n)
			int tmp = T1-T2;
			T1 = T2;
			T2 = tmp;
		}
		System.out.println(n);
		scan.close();
	}
}