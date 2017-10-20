import java.io.*;
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
            if (u == size * d + c)
                break;
            for (int i = 0; i < 8; ++i) {
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

    public static void main(String[] args) throws IOException {

        InputReader in = new InputReader(System.in);
        int a = in.readInt();
        int b = in.readInt();
        int c = in.readInt();
        int d = in.readInt();
        System.out.printf("%d\n", minMoves(8, a, b, c, d));
    }

    private static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int readInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public String readString() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public double readDouble() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            double res = 0;
            while (!isSpaceChar(c) && c != '.') {
                if (c == 'e' || c == 'E') {
                    return res * Math.pow(10, readInt());
                }
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            }
            if (c == '.') {
                c = read();
                double m = 1;
                while (!isSpaceChar(c)) {
                    if (c == 'e' || c == 'E') {
                        return res * Math.pow(10, readInt());
                    }
                    if (c < '0' || c > '9') {
                        throw new InputMismatchException();
                    }
                    m /= 10;
                    res += (c - '0') * m;
                    c = read();
                }
            }
            return res * sgn;
        }

        public long readLong() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public String next() {
            return readString();
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);
        }
    }

}
