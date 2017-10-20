import java.util.Scanner;

public class StevenMai_228 {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; ++i) {
            int k = i;
            for (int j = i+1; j < arr.length; ++j)
                if (arr[k] > arr[j]) k = j;
            if (k != i) {
                int tmp = arr[i];
                arr[i] = arr[k];
                arr[k] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; ++i) arr[i] = scan.nextInt();
        selectionSort(arr);
        for (int i = 0; i < N; ++i) System.out.printf("%d ", arr[i]);
        System.out.print("\n");
        scan.close();
    }
}