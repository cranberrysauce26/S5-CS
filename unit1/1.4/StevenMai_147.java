import java.util.Scanner;
public class StevenMai_147 {

    static double abs(double x) {
        return x > 0 ? x : -x;
    }

    static double area(double x1, double y1, double x2, double y2, double x3, double y3) {
        double x12 = x2-x1, x13 = x3-x1;
        double y12 = y2-y1, y13 = y3-y1;

        return abs(x12 * y13 - x13 * y12);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        double x3 = scan.nextDouble();
        double y3 = scan.nextDouble();

        double px = scan.nextDouble();
        double py = scan.nextDouble();

        double a = area(x1, y1, x2, y2, x3, y3);

        double a1 = area(x1, y1, x2, y2, px, py);
        double a2 = area(x1, y1, x3, y3, px, py);
        double a3 = area(x2, y2, x3, y3, px, py);

        if (a1+a2+a3 > a) System.out.println("Point p is outside the triangle");
        else System.out.println("Point p is within or on the border of the triangle");

        scan.close();
    }
}