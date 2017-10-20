import java.util.Scanner;
public class StevenMai_154 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the elements in your array");

        int max = Integer.MIN_VALUE, lo=0, hi=0;
        
        int i = 1, x = scan.nextInt();

        while (x != 0) {
            if (x == max) hi = i;
            else if (x > max) {
                max = x;
                lo = hi = i;
            }
            ++i;
            x = scan.nextInt();            
        }
        System.out.println("The index of the first maximum element is "+lo);
        System.out.println("The index of the last maximum element is "+hi);
        scan.close();
    }
}