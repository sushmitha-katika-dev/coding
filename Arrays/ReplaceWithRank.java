import java.util.ArrayList;
import java.util.List;

public class ReplaceWithRank {

    static void replaceWithRank(int nums[]){
        
        List<Integer> rankList = new ArrayList<>();
        
        for(int i = 0;i < nums.length; i++){
            
            int count = 1;
            for(int j = 0; j < nums.length; j++){
                if(nums[i] > nums[j]){
                    count++;
                }
            }
            int rank = count;
            rankList.add(rank);
        }

        System.out.println(rankList);
    }
    
    public static void main(String[] args) {
        int[] arr = {20, 15, 26, 2, 98, 6};
        replaceWithRank(arr);
    }

}
