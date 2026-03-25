public class MinSubArrLen {
    public static int minSubArrLen(int[] nums,int target){
        int sum = 0;
        int l = 0;
        int ans = Integer.MAX_VALUE;
        for(int r = 0; r < nums.length; r++){
             sum += nums[r];
             while(sum >= target){
                ans = Math.min(ans,r-l+1);
                sum -= nums[l];
                l++;
             }

        }
        if(ans == Integer.MAX_VALUE){
            return 0;
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(minSubArrLen(nums,target));
    }
}