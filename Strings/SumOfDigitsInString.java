public class SumOfDigitsInString {

    public static int sumOfDigits(String s){

        int sum  = 0;
        int num = 0;
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                num = num *10 + (ch - '0');
            }else{
                sum += num;
                num = 0;
            }
        }
        sum += num;
        return sum;
    }
    public static void main(String[] args) {
        String s = "12ab34";
        System.out.println(sumOfDigits(s));
    }
}
