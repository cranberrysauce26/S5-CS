import java.util.Scanner;
public class StevenMai_155 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int state=0, cnt=0;
        System.out.println("Enter the elements in your array");
        int x = scan.nextInt();
        while (x != 0) {
            int nxtstate = (x>0) ? 1 : -1;
            if (state+nxtstate==0) 
                ++cnt;
            state = nxtstate;
            x = scan.nextInt();
        }
        System.out.println("The number of sign changes is "+cnt);
        scan.close();
    }
}