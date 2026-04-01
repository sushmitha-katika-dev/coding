import java.util.Arrays;
import java.util.Scanner;

public class SecondHighest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 1) System.out.println("-1");
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int firstLargest = arr[n-1];
        int secondLarg = -1;

        for(int i = n-2; i >= 0; i--){
            if(arr[i] != firstLargest){
                secondLarg = arr[i];
                break;
            }
        }
        
        System.out.print(firstLargest);
        System.out.print(secondLarg);

        sc.close();
    }
}
