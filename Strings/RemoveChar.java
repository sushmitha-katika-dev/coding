import java.util.Scanner;


/*Problem Statement: Given two strings, write a program to remove characters 
    from the first string which are present in the second string. */

public class RemoveChar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.next();
        String str2 = scanner.next();

        StringBuilder result = new StringBuilder();

        // Traverse str1
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            boolean found = false;

            // Check if ch is in str2
            for (int j = 0; j < str2.length(); j++) {
                if (ch == str2.charAt(j)) {
                    found = true;
                    break;
                }
            }

            // If not found, add to result
            if (!found) {
                result.append(ch);
            }
        }

        System.out.println(result);
        scanner.close();
    }
}
