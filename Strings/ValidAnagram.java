import java.util.HashMap;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character,Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c : t.toCharArray()){
            if(!map.containsKey(c)) return false;
            map.put(c,map.get(c)-1);
        }
        for(int val : map.values()){
            if(val != 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println("valid Anagram: "+isAnagram(s,t));
    }
}