public class SumOfGp {
    
    public static double sumOfGP(double a, double r, int n) {
        // If ratio is 1
        if (r == 1)
            return a * n;

        // Use GP formula for r ≠ 1
        return a * (Math.pow(r, n) - 1) / (r - 1);
    }

    public static void main(String[] args) {
        // Sample input values
        double a = 2;
        double r = 3;
        int n = 4;
        
        System.out.println(sumOfGP(a, r, n));
    }
}
