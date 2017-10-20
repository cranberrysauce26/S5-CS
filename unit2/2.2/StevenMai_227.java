import java.util.Scanner;

public class StevenMai_227 {

    public static void sortDigits(byte[] arr) {
        int[] freq = new int[10];
        for (int i = 0; i < arr.length; ++i) ++freq[arr[i]];
        int k = 0;  
        for (byte i = 0; i < 10; ++i)
            for (int j = 0; j < freq[i]; ++j)
                arr[k++] = i;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        byte[] arr = new byte[N];
        for (int i = 0; i < N; ++i) {
            arr[i] = scan.nextByte();
            if (arr[i] > 9 || arr[i] < 0) {
                System.out.println("Illegal array");
                scan.close();
                return;
            }
        }
        sortDigits(arr);
        for (int i = 0; i < N; ++i) System.out.printf("%d ", arr[i]);
        System.out.print("\n");
        scan.close();
    }
}