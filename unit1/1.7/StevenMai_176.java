import java.util.Scanner;
public class StevenMai_176 {

    static double cbrt(double x) {
        double pre = x, cur = x + 1;
        while (cur != pre) {
            double tmp = cur;
            cur =  2.0/3.0 * pre + x/(3.0 * pre * pre);
            pre = tmp;
        }
        return cur;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        System.out.println(cbrt(a));
        scan.close();
    }
}