import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListSort {
   
    public void sortElementAlpha(List<String> neededList){
        //alphabetically sort
        System.out.print("sortedList in alphabetical order : ");
        Collections.sort(neededList);
        for (String sortedList : neededList) {
            System.out.print(" "+sortedList);
            
        }
         System.out.println(" ");
        //sort in reverse order
        System.out.print("sortedList in reverse Order : ");
        Collections.sort(neededList,Collections.reverseOrder());
        for (String sortedList : neededList) {
            System.out.print(" "+sortedList);
        }

    }

public static void main(String args[]){
    List<String> sampleData = new ArrayList<>(Arrays.asList("sush","pooz","mani","sruj","deep","suhas"));

    ArrayListSort als = new ArrayListSort();
    als.sortElementAlpha(sampleData);
}

}
