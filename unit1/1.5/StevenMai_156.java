import java.util.Scanner;
public class StevenMai_156 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the elements in your array");
        
        int cntmax=0;
        int cntmin=0;

        boolean min=true;
        boolean max=true;

        int x = scan.nextInt();
        int pre = x;
        
        while (x != 0) {
            pre = x;
            x = scan.nextInt();
            if (x != 0) {
                if (max && x < pre) ++cntmax;
                else if (min && x > pre) ++cntmin;
            } else {
                if (max) ++cntmax;
                else if (min) ++cntmin;
            }
            max = x > pre;
            min = x < pre;
        }
        
        System.out.println("The number of local minima is "+cntmin);
        System.out.println("The number of local maxima is " + cntmax);
        scan.close();
    }
}