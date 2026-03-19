import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListClear {

    public void clearElements(List<String> neededList){
        neededList.clear();
        for (String string : neededList) {
            System.out.println(string);
            
        }
    }
    

       public static void main(String args[]){
        List<String> sampleData = new ArrayList<>(Arrays.asList("sush","srujana","pooji","deepika","mani"));

        ArrayListClear alc = new ArrayListClear();
        alc.clearElements(sampleData);
    }
}
