import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PrintDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

      /*   //Approach - 1
       HashMap<Character,Integer> hm = new HashMap<>();

       for(char c : str.toCharArray()){ṇ
        hm.put(c,hm.getOrDefault(c, 0)+1);
       }
       for(Map.Entry<Character, Integer> entry : hm.entrySet()){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
       }
 */
       //Approach - 2
       int[] freq = new int[26];

        // Loop through the string and count character frequency
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a']++;
        }

        // Print characters that appear more than once
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 1) {
                System.out.println((char)(i + 'a') + " - " + freq[i]);
            }
        }
        scanner.close();

    }

}
