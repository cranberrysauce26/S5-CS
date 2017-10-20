import java.util.Scanner;

public class StevenMai_223 {
    public static void shift(int[] arr, int n) {
        int[] tmp = new int[arr.length];
        for (int i = 0; i < arr.length; ++i) 
            tmp[(i+n)%tmp.length] = arr[i];
        for (int i = 0; i < tmp.length; ++i) arr[i] = tmp[i];
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; ++i) arr[i] = scan.nextInt();
        int shft = scan.nextInt();
        shift(arr, shft);
        for (int i = 0; i < N; ++i) System.out.printf("%d ", arr[i]);
        System.out.print("\n");
        scan.close();
    }
}