public class StevenMai_173 {
    static int gcd(int a, int b) {
        return b==0 ? a : gcd(a, a%b);
    }

    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your two numbers");
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        System.out.println("The lcm of "+a+" and "+b+" is "+lcm(a, b));
        scan.close();
    }
}