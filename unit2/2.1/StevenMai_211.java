import java.util.Scanner;
import java.util.Random;
public class StevenMai_211 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        
		int N = scan.nextInt();
		int A = scan.nextInt();
		int B = scan.nextInt();
		int[] x = new int[N];
		for (int i = 0; i < N; ++i)
            x[i] = rand.nextInt(B-A+1)+A;
            
		int cnt = 1;
		for (int i = 1; i < N; ++i) if (x[i]==x[0]) ++cnt;
        System.out.println(x[0]+" "+cnt);
        

		cnt = 1;
		for (int i = 0; i < N-1; ++i) if (x[i]==x[N-1]) ++cnt;
		System.out.println(x[N-1]+" "+cnt);
        int v = -1; // sentinel value
        
		cnt = 1;
		for (int i = 1; i < N-1; ++i) {
			if (v==-1 && x[i]!=x[0] && x[i] != x[N-1]) v = i; 	
			else if (x[i]==x[v]) ++cnt;
		}
		if (v==-1) System.out.println("There is no other element");
        else System.out.println(v+" "+cnt);
        
		scan.close();
	}
}
