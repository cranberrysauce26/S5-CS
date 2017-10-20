public class StevenMai_121{
    public static void main(String[] args) {
        int a = 3, b = 7;
        a = (a=a+b)-(b=a-b);
        System.out.println(a);
        System.out.println(b);
    }
}