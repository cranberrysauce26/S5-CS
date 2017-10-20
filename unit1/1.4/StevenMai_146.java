import java.util.Scanner;
public class StevenMai_146 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float A, B, C;
        A = scan.nextFloat();
        B = scan.nextFloat();
        C = scan.nextFloat();
       
        if (A!=0) {
            if (B*B-4*A*C > 0) System.out.println(2);
            else if (B*B-4*A*C==0) System.out.println(1);
            else System.out.println(0);
        } 
        else if (B!=0) System.out.println(1);
        else if (C!=0) System.out.println(0);
        else System.out.println(-1);
        scan.close();
    }
}