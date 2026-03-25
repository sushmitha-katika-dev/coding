public class SingleNumber {
    public static int singleNumber(int[] nums){
        /* // O(n) time and space 
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            int key  = nums[i];
            hm.put(key,hm.getOrDefault(key,0)+1);
        }
        for(int num : nums){
            if(hm.get(num) == 1) return num;
        }
        return -1;
        */

        // O(n) time   O(1) space 
        int xor = 0;
        for(int num : nums){
            xor ^= num;
        }
        return xor;
    }
    public static void main(String[] args) {
        int arr[] = {4,1,2,1,2};
        System.out.println(singleNumber(arr));
    }

}
