

public class RecursiveBubbleSort {
    private static void bubble_sort(int nums[],int n){
        if(n == 1) return;
            for(int j = 0;j <= n-2;j++ ){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        bubble_sort(nums, n-1);
       
    }
    public static void main(String[] args) {
        int arr[] = {13,46,24,52,20,9};
        int n = arr.length;
        bubble_sort(arr, n);
         for (int k : arr) {
            System.out.print(k+" ");
        }
    }
}
