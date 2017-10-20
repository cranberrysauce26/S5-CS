import java.util.Scanner;
public class StevenMai_178 {

    static final double PI = 3.14159265358979323846;

    static double cos(double x) {
        x -= (double) ( (int) ( x / (2.0 * PI) ) ) * 2.0 * PI;
        if (x < 0) x = -x;
        if (x >= PI) x = 2*PI-x;      
        double sum = 0.0;
        double term = 1.0;
        double n = 0.0;
        while (term != 0) {
            sum += term;
            n += 2.0;    
            term *= -x * x / (n * (n-1.0) );
        }
        return sum;
    }

    static double sin(double x) {
        x -= (double) ( (int) ( x / (2.0 * PI) ) ) * 2.0 * PI;
        if (x >= PI || x <= -PI) x = PI-x;
        if (x > PI * 0.5 || x < -PI * 0.5) x = PI-x;
        double sum = 0.0;
        double term = x;
        double n = 1.0;
        while (term != 0) {
            sum += term;
            n += 2.0;    
            term *= -x * x / (n * (n-1.0) );
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        System.out.println("sin("+a+")="+sin(a)+" cos("+a+")="+cos(a));
        System.out.println("Math.sin("+a+")="+Math.sin(a)+" Math.cos("+a+")="+Math.cos(a));
        scan.close();
    }
}