// Problem: Find sum of AP series
// Approach: Use formula
// Time Complexity: O(1)

public class SumOfAp {

    public static int sumAP(int a, int d, int n) {
        return n * (2 * a + (n - 1) * d) / 2;
    }

    public static void main(String[] args) {
        int a = 2;  // first term
        int d = 2;  // common difference
        int n = 5;  // number of terms

        System.out.println(sumAP(a, d, n)); // 30
    }
}