// Problem: Check if a number is Positive, Negative or Zero
// Approach: Compare with 0
// Time Complexity: O(1)

public class CheckPositiveNegative {

    public static String checkNumber(int n) {
        if (n > 0) return "Positive";
        else if (n < 0) return "Negative";
        else return "Zero";
    }

    public static void main(String[] args) {
        int n = -5;
        //System.out.println(n > 0 ? "Positive" : (n < 0 ? "Negative" : "Zero"));
        System.out.println(n + " is " + checkNumber(n));
    }
}