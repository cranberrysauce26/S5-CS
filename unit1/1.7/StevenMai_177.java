public class StevenMai_177 {

    static double constantE() {
        double term = 1.0;
        double sum = 1.0;
        int n = 1;
        while (term != 0) {
            sum += term;
            term /= ++n;
        }
        return sum;
    }
    
    public static void main(String[] args) {
       System.out.println("constantE() = "+ constantE());
       System.out.println("Math.e = "+Math.E);
    }
}