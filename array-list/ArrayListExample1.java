import java.util.ArrayList;
import java.util.List;

public class ArrayListExample1 {

    public List<String> addName(){
        List<String> nameList = new ArrayList<>();
        nameList.add("Sushmitha");
        nameList.add("poojitha");

        for (String  name : nameList) {
            System.out.println(name);
            
        }
        return nameList;
    }

    public static void main(String args[]){
        ArrayListExample1 al1 = new ArrayListExample1();
        al1.addName();
    }

    
}
