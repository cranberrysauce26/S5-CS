import java.util.Scanner;

public class StevenMai_224 {
    public static void shuffle(int[] arr) {
        for (int i = arr.length-1; i > 0; --i) {
            int j = (int) ( Math.random() * i );
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; ++i) arr[i] = scan.nextInt();
        shuffle(arr);
        for (int i = 0; i < N; ++i) System.out.printf("%d ", arr[i]);
        System.out.print("\n");
        scan.close();
    }
}