import java.util.Scanner;
public class StevenMai_171 {

    static bool isPrime(int x) {
        for (int f = 2; f*f <= x; ++f)
            if (x%f==0) return false;
        return x > 1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a natural number");
        int x = scan.nextInt();
        if (isPrime(x)) {
            System.out.println(x+" is prime");
        } else {
            System.out.println(x+" is not prime");
        }
        scan.close();
    }

};