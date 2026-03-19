// Problem: Check if a number is Perfect Number
// Approach: Sum of proper divisors 
// Time Complexity: O(log n)

public class CheckPerfectNumber {

    public static boolean isPerfect(int num){
        if (num <= 1) return false;

        int sum = 0;

        for(int i = 1;i <= num/2; i++){
            if(num % i == 0){
                sum += i;
            }
        }

        if(sum == num) return true;

        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPerfect(6));
        System.out.println(isPerfect(9));
       //these are perfect squares 6, 28, 496, and 8128. 
    }

}
