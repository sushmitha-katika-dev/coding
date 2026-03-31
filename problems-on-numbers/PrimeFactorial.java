import java.util.Scanner;

public class PrimeFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Prime factors of "+num+": ");
        
        if (num % 2 == 0) {
            System.out.print(2 + " ");
            while (num % 2 == 0) {
                num /= 2;
            }
        }

        for(int i = 3; i <= Math.sqrt(num); i++){
            while( num % i == 0 ){
                System.out.print(i+" ");
                num /= i;
            }
        }
        if(num > 2){
            System.out.println(num);
        }

    }

}
