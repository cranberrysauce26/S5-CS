import java.util.Scanner;

public class StevenMai_161 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number");
        int N = scan.nextInt();
        System.out.println("Here are the squares of the first " + N + " natural numbers");
        for (int i = 1, square = 1; i <= N; ++i, square += (i<<1) - 1) System.out.println(square);
    }
};