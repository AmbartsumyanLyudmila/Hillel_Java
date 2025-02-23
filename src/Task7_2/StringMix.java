package Task7_2;

import java.util.Scanner;

public class StringMix {
    public static String mixString(String a, String b) {
        String result = "";
        int minLength = Math.min(a.length(), b.length());

        for (int i = 0; i < minLength; i++) {
            result += a.charAt(i);
            result += b.charAt(i);
        }

        for (int i = minLength; i < a.length(); i++) {
            result += a.charAt(i);
        }

        for (int i = minLength; i < b.length(); i++) {
            result += b.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first row of characters =>  ");
        String firstString = scanner.nextLine();

        System.out.print("Enter the second row of characters =>  ");
        String secondString = scanner.nextLine();

        String mixedString = mixString(firstString, secondString);
        System.out.println("MixSting = " + mixedString);

        scanner.close();
    }
}
