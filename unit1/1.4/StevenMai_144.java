import java.util.Scanner;
public class StevenMai_144 {

    static float abs(float x) {return x >= 0 ? x : -x;}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float A, B, x, y;
        A = scan.nextFloat();
        B = scan.nextFloat();
        x = scan.nextFloat();
        y = scan.nextFloat();
        if (abs(x) <= A && abs(y) <= B) 
            System.out.println(1);
        else System.out.println(0);
        scan.close();
    }
}