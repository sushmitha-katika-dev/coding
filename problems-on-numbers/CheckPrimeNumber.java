// Problem: Check if a number is prime
// Approach: Check divisibility from 2 to sqrt(n)
// Time Complexity: O(sqrt(n))
public class CheckPrimeNumber {
    public static boolean isPrime(int n){

        if(n <= 1 ) return false;

        int limit = (int)Math.sqrt(n);

        for(int i = 2;i <= limit; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(6));
        System.out.println(isPrime(7));
    }
}
