import java.util.Scanner;

public class StevenMai_229 {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; ++i) {
            for (int j = i; j > 0 && arr[j] < arr[j-1]; --j) {
                int tmp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; ++i) arr[i] = scan.nextInt();
        insertionSort(arr);
        for (int i = 0; i < N; ++i) System.out.printf("%d ", arr[i]);
        System.out.print("\n");
        scan.close();
    }
}