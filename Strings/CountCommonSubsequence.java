import java.util.HashSet;

public class CountCommonSubsequence {

    public static int count(String s1,String s2){

        HashSet<Character> hs = new HashSet<>();

        
        for(char ch : s1.toCharArray()){
            hs.add(ch);
        }

        int count = 0;
        
        for(char ch : s2.toCharArray()){
            if(hs.contains(ch)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "bcd";
        System.out.println(count(s1,s2));
    }
}
