import java.util.Scanner;
public class StevenMai_216 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        double sum = 0;
        double avg = 0;

        double minDist = Double.MAX_VALUE;
        double maxDist = -1;

        double[] x = new double[N];


        for (int i = 0; i < N; ++i) {
            x[i] = scan.nextDouble();
            sum += x[i];
        }

        avg = sum / (double) N;

        for (int i = 0; i < N; ++i) {
            maxDist = Math.max(maxDist, Math.abs(x[i]-avg));
            minDist = Math.min(minDist, Math.abs(x[i]-avg));
        }
            
        System.out.println(minDist+" " + maxDist);
        scan.close();
    }
}