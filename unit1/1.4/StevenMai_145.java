import java.util.Scanner;
public class StevenMai_145 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float A, B, x, y;
        A = scan.nextFloat();
        B = scan.nextFloat();
        x = scan.nextFloat();
        y = scan.nextFloat();
        if (B > -A && y > x * x - A && y < B-x*x) 
            System.out.println("The point is in the region.");
        else System.out.println("The point is not in the region.");
        scan.close();
    }
}