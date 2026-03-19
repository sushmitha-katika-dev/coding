
public class SelectionSort {
    public static void sort(int arr[]){
        int n = arr.length;
        for(int i = 0;i < n-1;i++){
            int min = i;
            for(int j = i+1;j < n;j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
                
        }
        for (int k : arr) {
            System.out.print(k+" ");
        }
            
    }
  public static void main(String[] args) {
    int arr[] = {7,8,4,3,4,2,9,13};
    sort(arr);
  }  
}
