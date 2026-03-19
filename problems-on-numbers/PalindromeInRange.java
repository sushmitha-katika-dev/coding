
public class PalindromeInRange {
    public static boolean isPalindrome(int num){
        int original = num;
        int rev = 0;
        while(num > 0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        if(original == rev) return true;
        return false;
    }
    public static void main(String[] args) {
        int start = 10;
        int end = 20;
        System.out.println("Palindrome in Range : ");

        for(int i = start; i <= end; i++){
            if(isPalindrome(i)) System.out.print(i+" ");;
        }
    }

}


//palindrome in a range

// 👉 For every number in range:
// 1. Reverse the number
// 2. Compare with original
// 3. If equal → print it

//Checking one number → O(log n)
//Range → O(n log n)

