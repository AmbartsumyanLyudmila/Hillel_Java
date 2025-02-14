package Task6_4;

import java.util.Scanner;

public class ArraySearch {
    public static boolean includeNumber(int[] arr, int manualNumber) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == manualNumber) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Please enter an array consisting of 10 values: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.print("Check number: ");
        int manualNumber = scanner.nextInt();
        if (includeNumber(numbers, manualNumber)) {
            System.out.println("Your number => " + manualNumber + " is present in array");
        } else {
            System.out.println("Your number => " + manualNumber + " is absent in array");
        }

        scanner.close();
    }
}

