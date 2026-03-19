
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {
    public static int partition(List<Integer> nums,int low,int high){
        int pivot = nums.get(low);
        int i = low;
        int j = high;

        while (i < j) {
            while(nums.get(i) <= pivot && i <= high-1){
                i++;
            }
            
            while (nums.get(j) > pivot && j >= low+1) {
                j--;                
            }
            if(i < j){
                int temp = nums.get(i);
                nums.set(i, nums.get(j));
                nums.set(j, temp);
            }
        }
        int temp = nums.get(low);
        nums.set(low,nums.get(j));
        nums.set(j, temp);
        return j;
        
    }

    static void qs(List<Integer> arr, int low, int high){
        if(low < high){
            int pIndex = partition(arr, low, high);        ;
            qs(arr, low, pIndex-1);
            qs(arr, pIndex+1, high);
        }
    }

    static List<Integer> quick_sort(List<Integer> arr){
        qs(arr,0,arr.size()-1);
        return arr;
    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr = Arrays.asList(46,13,24,9,20,52);
        quick_sort(arr);
         for (int k : arr) {
            System.out.print(k+" ");
        }
    }
}
