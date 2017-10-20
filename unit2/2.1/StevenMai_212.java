import java.util.Scanner;

public class StevenMai_212 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        double maxDiff = -1;
        double x = 0, last = 0;
        for (int i = 0; i < N; ++i) {
            last = x;
            x = scan.nextDouble();
            if (i != 0 && maxDiff < Math.abs(x-last) ) maxDiff = Math.abs(x-last); 
        }
        System.out.println(maxDiff);
        scan.close();
    }
}