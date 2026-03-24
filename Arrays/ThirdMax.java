import java.util.Arrays;

public class ThirdMax {
    public static int thirdMax(int[] nums){
        /*
         // Approach 1: Sorting + counting distinct elements (O(n log n))
        Arrays.sort(nums);
        int count = 1;
        for(int i = nums.length-2; i >= 0; i--){
            if(nums[i] != nums[i+1]){
                count++;
            }
            if (count == 3) {
                return nums[i];
            }
        }
        return nums[nums.length-1]; 
        */

        // Approach 1: One-pass (3 variables) – optimal solution
        Long first = null, second = null, third = null;

        for(int num : nums){
            long n = num;
            
            //skip duplicates
            if((first != null && n == first) || (second != null && n == second) || (third != null && n == third)){
                continue;
            }

            if(first == null || n > first){
                third = second;
                second = first;
                first = n;
            }
            else if(second == null || n > second){
                third = second;
                second = n;
            }
            else if(third == null || n > third) {
                third = n;
            }
        }
        return third == null? first.intValue():third.intValue();

    }

    public static void main(String[] args) {
        int arr1[] = {2,2,3,1};
        int arr2[] ={1,2};
        int arr3[] = {1,2,3};
        System.out.println(thirdMax(arr1));//1
        System.out.println(thirdMax(arr2));//2
        System.out.println(thirdMax(arr3));//1
    }
}