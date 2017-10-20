import java.util.Scanner;

public class StevenMai_225 {
    public static void split(int[] arr) {
        for (int l = 0, r = arr.length-1; l != r;) {
            if (arr[l]<0) ++l;
            else {
                int tmp = arr[l];
                arr[l] = arr[r];
                arr[r] = tmp;
                --r;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; ++i) arr[i] = scan.nextInt();
        split(arr);
        for (int i = 0; i < N; ++i) System.out.printf("%d ", arr[i]);
        System.out.print("\n");
        scan.close();
    }
}