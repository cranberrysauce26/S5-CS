import java.util.*;
import java.io.*;
public class Test {
    public static void main(String[] args) {
        File f = new File("data.txt");
        try {
            Scanner scan = new Scanner(f);
            double x = scan.nextDouble();
            System.out.println(x);
            scan.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
    }
}