package Task5_1;

import java.util.Scanner;

public class AgeChecker {
    public static String checkAge(int age) {
        if (age >= 18) {
            return "Ви доросла особа";
        } else {
            return "Ви не є дорослою особою";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Який ваш вік? ");
        int age = scanner.nextInt();
        System.out.println(checkAge(age));
        scanner.close();
    }
}
