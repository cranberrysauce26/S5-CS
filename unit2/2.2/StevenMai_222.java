import java.util.Scanner;

public class StevenMai_222 {
    public static void reverse(int[] arr) {
        for (int i = 0; i < arr.length-i-1; ++i) {
            int tmp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = tmp;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; ++i) arr[i] = scan.nextInt();
        reverse(arr);
        for (int i = 0; i < N; ++i) System.out.printf("%d ", arr[i]);
        System.out.print("\n");
        scan.close();
    }
}