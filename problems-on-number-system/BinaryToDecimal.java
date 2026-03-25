
public class BinaryToDecimal {
    public static int binaryToDecimal(String s){

        int ans = 0;
        int base = 1;
        for(int i = s.length()-1; i >= 0;i--){
            if(s.charAt(i) == '1'){
                ans += base;
            }
            base *= 2;
        }
        return ans;

        // // Use built-in method with radix 2
        // return Integer.parseInt(s, 2);

    }
    public static void main(String[] args) {
        String s = "1011";
        System.out.println(binaryToDecimal(s));;
    }

}
