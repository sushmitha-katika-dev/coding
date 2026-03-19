import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDelContainsLetter {
    public void needToDelete(List<String> neededList){
        List<String> needToDelete = new ArrayList<>();
        for (String names : neededList) {
            if(names.contains("u")){
                needToDelete.add(names);
            }            
        }
        neededList.removeAll(needToDelete);
        System.out.println(neededList);
    }

public static void main(String[] args) {
    List<String> sampleData = new ArrayList<>(Arrays.asList("sush","sruj","pooz","manu"));
    
    ArrayListDelContainsLetter aldc = new ArrayListDelContainsLetter();
    aldc.needToDelete(sampleData);

}

}
