
public class InsertionSort {
    
    private static void insert_sort(int[] arr, int n) {
        for(int i = 0;i < n;i++){
            int j = i;
            while(j > 0 && arr[j-1] > arr[j]  ){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {7, 4, 1, 5, 3};
        int n = arr.length;
        insert_sort(arr,n);
    }

}
