import java.util.Scanner;

public class StevenMai_163 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter N");
        int N = scan.nextInt();
        double e = 0;
        int factorial = 1;
        for (int i = 1; i <= N; ++i) {
            e += 1.0 / (double)factorial;
            factorial *= i;
            System.out.println("At iteration " + i + ", e = " + e);
        }
    }
};