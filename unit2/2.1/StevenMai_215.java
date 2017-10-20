import java.util.Scanner;
public class StevenMai_215 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(), totSum = 0, indexSum=0;
        int[] x = new int[N];
        for (int i = 0; i < N; ++i) {
            x[i] = scan.nextInt();
            totSum += x[i];
        }

        for (int i = 0; i < N; ++i)
            if (2*x[i] > totSum)
                indexSum += i;
        System.out.println(indexSum);
        scan.close();
    }
}