import java.util.Scanner;

public class StevenMai_162 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number");
        int N = scan.nextInt();
        long factorial = 1;
        for (int i = 1; i <= N; ++i) {
            factorial *= i;
            System.out.println(i+"! = " + factorial);
        }
    }
};