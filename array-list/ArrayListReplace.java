import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListReplace {
    
    public void replacElementAtIndex(List<String> neededList){
        if(neededList.size()>=3){
            neededList.set(1,"sruj");
        }
        for (String replacedList : neededList) {
            System.out.println(replacedList);
        }
    }

    public static void main(String args[]){
        List<String> sampleData = new ArrayList<>(Arrays.asList("sush","srujana","ddeep","sanj","mani"));

        ArrayListReplace alr = new ArrayListReplace();
        alr.replacElementAtIndex(sampleData);
    }
    
}
