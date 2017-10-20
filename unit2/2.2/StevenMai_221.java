import java.util.Scanner;

public class StevenMai_221 {
    public static void randomize(int[] arr, int lower, int upper) {
        for (int i = 0; i < arr.length; ++i) 
            arr[i] = (int) ( Math.random() * (upper-lower+1) ) + lower;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int lower = scan.nextInt();
        int upper = scan.nextInt();
        int[] arr = new int[N];
        randomize(arr, lower, upper);
        for (int i = 0; i < N; ++i) System.out.printf("%d ", arr[i]);
        System.out.print("\n");
        scan.close();
    }
}