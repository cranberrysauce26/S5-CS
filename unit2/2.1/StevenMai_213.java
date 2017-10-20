import java.util.Scanner;

public class StevenMai_213 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        double[] x = new double[N];

        for (int i = 0; i < N; ++i) 
           x[i] = scan.nextDouble();

        boolean isp = true;
        for (int i = 0; i <= N-1-i && isp; ++i)
            if (x[i] != x[N-i-1]) isp = false;
            
        if (isp) System.out.println("A Palindrome");
        else System.out.println("Not a Palindrome");
        scan.close();
    }
}