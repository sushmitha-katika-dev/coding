import java.util.Scanner;

public class ConcatenateStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();

        /* StringBuilder result = new StringBuilder();
        result.append(str1);
        result.append(str2);

        System.out.println(result); */
       // str1 = str1 + str2;
        System.out.println(str1 + str2);

        scanner.close();
    }

}
