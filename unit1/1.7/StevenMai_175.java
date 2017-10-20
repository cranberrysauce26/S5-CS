import java.util.Scanner;
public class StevenMai_175 {

    static double sqrt(double x) {
        double pre = x, cur = x + 1;
        while (cur != pre) {
            double tmp = cur;
            cur = 0.5 * pre + 0.5 * x / pre;
            pre = tmp;
        }
        return cur;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        if (a < 0) System.out.println("You cannot enter a negative number\n");
        else System.out.println(sqrt(a));
        scan.close();
    }
}