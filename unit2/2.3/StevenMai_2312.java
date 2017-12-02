import java.util.*;

public class StevenMai_2312 {

    static final int[] dx = { 2, 2, 1, -1, -2, -2, -1, 1 };
    static final int[] dy = { -1, 1, 2, 2, 1, -1, -2, -2 };

    public static int minMoves(int size, int a, int b, int c, int d) {
        int[] dist = new int[size * size];
        Arrays.fill(dist, -1);
        --a; --b; --c; --d;
        dist[size * b + a] = 0;
        Queue<Integer> q = new ArrayDeque<Integer>();
        q.add(size * b + a);
        while (!q.isEmpty()) {
            int u = q.poll();
            if (u == size * d + c) break;
            for (int i = 0; i < size; ++i) {
                int y = u/size + dy[i];
                int x = u%size + dx[i];
                if (y >= 0 && y < size && x >= 0 && x < size && dist[size*y+x]==-1) {
                    dist[size * y + x] = 1 + dist[u];
                    q.add(size * y + x);
                }
            }
        }
        return dist[size * d + c];
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        System.out.printf("%d\n", minMoves(size, a, b, c, d));
    }

}
