import java.util.Arrays;
import java.util.List;

public class ArrayListcheckIf {


    public void checkIfNameExists(List<String> namedList) {
        for(String names: namedList){
            if(names.contains("poojitha")){
                System.out.println("name exists");
                return;
            }
        }
        System.out.println("nope");
    }

    public static void main(String args[]){
        
        List<String> sampleNames=Arrays.asList("Sushmitha","poojitha","kranthi");
      
        ArrayListcheckIf alc = new ArrayListcheckIf();
        alc.checkIfNameExists(sampleNames);
    }
}
