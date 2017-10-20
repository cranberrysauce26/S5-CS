import java.util.Scanner;
public class StevenMai_143 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float A, B, C, x, y;
        A = scan.nextFloat();
        B = scan.nextFloat();
        C = scan.nextFloat();
        x = scan.nextFloat();
        y = scan.nextFloat();
        if (A==0) System.out.println("A cannot be zero");
        else {
            if (x * x + B * x / A + C / A < y / A) 
                System.out.println(1);
            else System.out.println(0);
        }
        scan.close();
    }
}