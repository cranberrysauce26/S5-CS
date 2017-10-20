import java.util.Scanner;
public class StevenMai_214 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] x = new int[N];
        for (int i = 0; i < N; ++i) 
            x[i] = scan.nextInt();
        for (int i = 0; i+1 < N; i += 2) {
            if ( (x[i]&1) == (x[i+1]&1) ) {
                int tmp = x[i];
                x[i] = x[i+1];
                x[i+1] = tmp;
            }
        }
        for (int i = 0; i < N; ++i) System.out.print(x[i]+" ");
        System.out.println("");
        scan.close();
    }
}