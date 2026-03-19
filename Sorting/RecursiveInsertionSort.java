
public class RecursiveInsertionSort {
    
    public static  void insert_sort(int nums[], int i, int n){
       
        if(i == n) return;
        int j = i;
                while(j > 0 && nums[j] < nums[j-1]){
                    int temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                    j--;
                }
            insert_sort(nums, i+1, n);
    }
    public static void main(String[] args) {
        int arr[] = {13,46,24,52,20,9};
        int n = arr.length;
        insert_sort(arr, 0,n);
         for (int k : arr) {
            System.out.print(k+" ");
        }
    }
}
