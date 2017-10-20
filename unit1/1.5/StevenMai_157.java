import java.util.Scanner;
public class StevenMai_157 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number");
        long N = scan.nextLong();
        int sum = 0;
        while (N > 0) {
            sum += N%10;
            N /= 10;
        }
        System.out.println("The sum of the digits of N is "+sum);
        scan.close();
    }
}