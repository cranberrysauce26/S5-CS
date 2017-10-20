import java.util.Scanner;
public class StevenMai_153 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the elements in your array");

        int max = Integer.MIN_VALUE, cnt=0, x = scan.nextInt();
        
        while (x != 0) {
            if (x==max) ++cnt;
            else if (x > max) {
                max = x;
                cnt = 1;
            }
            x = scan.nextInt();
        }
        System.out.println("The number of elements with a maximum value is "+cnt);
        scan.close();
    }
}