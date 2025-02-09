package Task5_2;

import java.util.Scanner;

public class SquareChecker {
    public static boolean isSquareNumber(int number) {
        if (number < 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(number);
        return sqrt * sqrt == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ціле число  ");
        int number = scanner.nextInt();
        if (isSquareNumber(number)) {
            System.out.println(number + " є квадратом цілого числа");
        } else {
            System.out.println(number + " не є квадратом цілого числа");
        }
        scanner.close();
    }
}
