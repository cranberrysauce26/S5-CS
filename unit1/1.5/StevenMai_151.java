import java.util.Scanner;
public class StevenMai_151 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int sum = 0;

        while (x != 0) {
            if (x < 0) sum += x;
            x = scan.nextInt();
        }

        System.out.println("The sum of all negative elements in your array is "+sum);
        scan.close();
    }
}