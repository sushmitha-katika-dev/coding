import java.util.Arrays;
import java.util.List;

public class ArrayListRemove {
    public static void main(String args[]){
        List<String> sampleNames = Arrays.asList("sush","sruj","deep");
        ArrayListRemove alr = new ArrayListRemove();
        alr.deleteElement(sampleNames);
    }

    public void deleteElement(List<String> neededList) {
        if(neededList.contains("sush")){
            neededList.remove("sush");
        }
       for (String names : neededList){
        System.out.println(names);
       }
    }
    
}
