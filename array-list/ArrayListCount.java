import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListCount {

    public void countNameStartsWith(List<String> neededList){
        int count = 0;
        for (String names : neededList) {
            if(names.startsWith("s")){
                count++;
                System.out.println(names);
            }
            
        }
        System.out.println("count = "+count);
    }
    public static void main(String args[]){
        List<String> sampleData = new ArrayList<>(Arrays.asList("sush","srujana","pooji","deepika","mani"));

        ArrayListCount alc = new ArrayListCount();
        alc.countNameStartsWith(sampleData);
    }
    
}
