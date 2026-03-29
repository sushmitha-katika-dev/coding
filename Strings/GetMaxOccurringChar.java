import java.util.Arrays;

public class GetMaxOccurringChar {
    public static void main(String[] args) {
        String s = "hellogithu0b";

        char arr[] = s.toCharArray();

        Arrays.sort(arr);

        int maxFreq = 0;
        int countFreq = 1;
        char maxChar = arr[0];

        for(int i = 1; i < s.length(); i++){
            if(arr[i] == arr[i-1]){
                countFreq++;
            }else{
                if (countFreq > maxFreq) {
                    maxChar = arr[i-1];
                    maxFreq = countFreq;
                }
                countFreq = 1;
            }
        }
        if(countFreq > maxFreq) {
            maxFreq = countFreq;
            maxChar = arr[s.length()-1];
        }
        System.out.println(maxChar);
    }

}
