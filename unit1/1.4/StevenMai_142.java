import java.util.Scanner;
import java.util.Arrays;
public class StevenMai_142 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] s = new String[3];
        for (int i = 0; i < 3; ++i) 
            s[i] = scan.next();
        Arrays.sort(s);
        for (String str : s) System.out.println(str);
        scan.close();
    }
}