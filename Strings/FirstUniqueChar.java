import java.util.HashMap;

public class FirstUniqueChar {
    public static int firstUniqueChar(String s){
        /* 
        // Approach 1: HashMap (O(n), O(n))
        // Store frequency using map, then find first unique
        
        //count frequency
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char key : s.toCharArray()){
            hm.put(key,hm.getOrDefault(key,0)+1);
        }
        
        // find first unique char
        for(int i = 0; i < s.length(); i++){
            if(hm.get(s.charAt(i)) == 1){
                return i;
            }
        }
         */

         
        // Approach 2: Frequency array (O(n), O(1))
        // Count occurrences, then find first char with freq = 1

        int freq[] = new int[26];

        //count frequency
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < s.length(); i++){
            if(freq[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        
        return -1;
    }
    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqueChar(s));
    }

}
