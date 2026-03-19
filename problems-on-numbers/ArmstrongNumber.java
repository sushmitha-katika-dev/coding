// Problem: Check if a number is Armstrong
// Approach: Sum of digits^number of digits
// Time Complexity: O(log n)

public class ArmstrongNumber {
    public boolean isArmstrong(int n) {

        if(n < 0) return false;

        int originalN = n;
        int count = 0;
        int sum = 0;
       
        int temp  = Math.abs(n);

        // Count digits
            while(temp > 0){
            temp = temp/10;
            count++;
            }

            if(count == 0) count = 1;
        
        temp = n;

        // Calculate sum
        while (temp != 0) {
            int rem = temp % 10;
            sum += Math.pow(rem, count);
            temp /= 10;
        }

        return originalN == sum;

    }
    public static void main(String[] args) {
        ArmstrongNumber a = new ArmstrongNumber();
        System.out.println(a.isArmstrong(123));
        System.out.println(a.isArmstrong(153));
    }
}
