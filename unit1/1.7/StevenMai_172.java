public class StevenMai_172 {
    static double getArea(double a, double b, double c) {
        double s = (a+b+c) * 0.5;
        return Math.sqrt(s * (s-a) * (s-b) * (s-c));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the side lengths of your triangle");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        System.out.println("The area of the triangle is " + getArea(a, b, c));
        scan.close();
    }
}