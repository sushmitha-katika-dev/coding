// Problem: Check if a number is Even or Odd
// Approach: Use modulus operator
// Time Complexity: O(1)

public class EvenOdd {

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        int n = 7;

        //System.out.println((n % 2 == 0) ? "Even" : "Odd");
        
        if (isEven(n)) {
            System.out.println(n + " is Even");
        } else {
            System.out.println(n + " is Odd");
        }
    }
}
