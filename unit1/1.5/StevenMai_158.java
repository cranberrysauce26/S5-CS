import java.util.Scanner;
public class StevenMai_158 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your number");

        int cnt=0, N = scan.nextInt();
        
        while (N>1) {
            cnt += (N&1) + 1;
            N >>= 1;
        }

        System.out.println("The minimum number of multiplications is "+cnt);

        scan.close();
    }
}