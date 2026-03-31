
public class StrongNumber {

    // Function to calculate the factorial of a number
    public static int Factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    // Function to compute the sum of factorials of the digits
    public static int Strong_No(int num) {
        int sum = 0;
        // Extract all the digits from num
        while (num > 0) {
            int digit = num % 10;
            sum += Factorial(digit);
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int number = 145;
        int answer = Strong_No(number);
        if (answer == number && number != 0) {
            System.out.println("YES");  // If the sum of factorials equals the number itself
        } else {
            System.out.println("NO");   // Otherwise
        }
    }
}