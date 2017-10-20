import java.util.Scanner;
public class StevenMai_152 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum=0, cnt=0, x = scan.nextInt();
      
        System.out.println("Enter the elements in your array");
        while (x != 0) {
            if (x % 2 == 0) {
                sum += x;
                ++cnt;
            }
            x = scan.nextInt();
        }
        System.out.println("The average of all even elements in your array is " + (double)sum / (double)cnt);
        scan.close();
    }
}