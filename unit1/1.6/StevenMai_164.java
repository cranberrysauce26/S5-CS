/*
    This problem correctly prints the first 
    8 perfect numbers. It takes some time to run though.
*/

public class StevenMai_164 {

    static final long MAX_LONG = 0x7FFFFFFFFFFFFFFFL;

    static long divsum(long x) {
        long sum = 0;
        long root = (long)Math.sqrt(x);
        for (long i = 1; i <= root; ++i)
            if (x%i==0) sum += i + x/i;
        sum -= x;            
        return sum;
    }

    public static void main(String[] args) {
        for (int i = 2; i <= 40; ++i) {
            long a = ( (1<<i)-1 );
            long b = (1<<(i-1));
            long x = a * b;
            if (a <= 0 || a >= MAX_LONG || a <= 0 || b >= MAX_LONG || x < 0 || x >= MAX_LONG) 
                break;
            if (divsum(x)==x) System.out.println(x);
        }
    }
};