import java.util.Scanner;
public class StevenMai_141 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float x, y, r;
        x = scan.nextFloat();
        y = scan.nextFloat();
        r = scan.nextFloat();
        if ( x * x + y * y <= r * r) System.out.println("Within");
        else System.out.println("Beyond");
        scan.close();
    }
}