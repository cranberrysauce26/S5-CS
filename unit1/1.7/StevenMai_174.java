public class StevenMai_174 {
    static int countFactors(int x) {
        int cnt=0;
        for (int f = 1; f*f <= x; ++f) 
            if (x%f==0)
                cnt += (f*f==x) ? 1 : 2;
        return cnt;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a natural number");
        int x = scan.nextInt();
        System.out.println("The number of factors of "+x+" is "+countFactors(x));
        scan.close();
    }
}