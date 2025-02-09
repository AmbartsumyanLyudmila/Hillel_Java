package Task5_3;

import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть число N: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Хибні вхідні параметри");
        } else {
            for (int i = 1; i <= n; i++) {
                System.out.print(i);
                if (i < n) {
                    System.out.print(" ");
                }
            }
        }

        scanner.close();
    }
}
