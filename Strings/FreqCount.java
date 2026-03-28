import java.util.HashMap;
import java.util.Map;

public class FreqCount {
    public static void freqCount(String s){
        /* HashMap<Character,Integer> hm = new HashMap<>();
        for(char ch : s.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        return hm; */
        int freq[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // Print characters with non-zero frequency
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
            System.out.print((char)(i + 'a') + "" + freq[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
        String s = "programming";
        freqCount(s);
    }

}
