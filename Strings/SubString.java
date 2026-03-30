/* Problem Statement: Given two strings text and pattern
 find the first occurrence of str1 in str2
 if found print it’s index if not found print -1. */

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.next();
        String str2 = scanner.next();

        // The indexOf method returns the index of the first occurrence,
        // or -1 if the substring is not found.

        int index = str1.indexOf(str2);
        System.out.println(index);
        
        scanner.close();
    }

}
