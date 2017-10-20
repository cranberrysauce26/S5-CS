public class StevenMai_122 {
    static int pow(int x, int e) {
        if (e==0) return 1;
        int tmp=pow(x, e>>1);
        return e%2==1 ? x * tmp * tmp : tmp * tmp;
    }
    public static void main(String[] args) {
        int x=1, e = 105;
        System.out.println(pow(x, e));
    }
}