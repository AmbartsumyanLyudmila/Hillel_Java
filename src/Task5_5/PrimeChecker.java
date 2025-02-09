package Task5_5;

import java.util.Scanner;

public class PrimeChecker {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true; // Якщо не знайшлося дільників, число просте
    }

    public static void checkNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть число N: ");
        int n = scanner.nextInt();

        if (isPrime(n)) {
            System.out.println("Число " + n + " є простим");
        } else {
            System.out.println("Число " + n + " не є простим");
        }

        scanner.close();
    }

    public static void main(String[] args) {
        checkNumber();
    }
}
