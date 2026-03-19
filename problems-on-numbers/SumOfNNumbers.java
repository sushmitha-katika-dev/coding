// Problem: Sum of first N natural numbers
// Approach: Mathematical formula
// Time Complexity: O(1)

public class SumOfNNumbers {

    public static int sum(int n) {
        if(n < 0) return 0;
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        System.out.println(sum(5)); // 15
    }
}