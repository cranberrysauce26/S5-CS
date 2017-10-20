import java.util.Scanner;

public class StevenMai_2210 {
    public static int[] merge(int[] a, int[] b) {
        int[] c = new int[a.length+b.length];
        int i = 0, ai=0, bi=0;
        for (; ai < a.length && bi < b.length; ++i) {
            if (a[ai] < b[bi]) c[i] = a[ai++];
            else c[i] = b[bi++];
        }
        for (; ai < a.length; ++ai, ++i) c[i] = a[ai];
        for (; bi < b.length; ++bi, ++i) c[i] = a[ai];
        return c;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; ++i) a[i] = scan.nextInt();

        int M = scan.nextInt();
        int[] b = new int[M];
        for (int i = 0; i < M; ++i) b[i] = scan.nextInt();

        int[] c = merge(a, b);
        for (int i = 0; i < c.length; ++i) System.out.printf("%d ", c[i]);
        System.out.print("\n");
        scan.close();
    }
}