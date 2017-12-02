/*input
antelope
*/
import java.util.*;
public class StevenMai_252 {
    static char mostOften(String s){
        int[] freq = new int[256];

        for (int i = 0; i < s.length(); ++i) ++freq[s.charAt(i)];
    
        char maxC = 0;
        for (char i = 1; i < freq.length; ++i) 
            if (freq[i] > freq[maxC]) maxC = i;
        return maxC;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        
        System.out.println(mostOften(s));
        scan.close();
    }
}