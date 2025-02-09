package Task5_4;

import java.util.Scanner;

public class Grade {
    public static String getGrade(int grade) {
        if (grade == 5) {
            return "Відмінно";
        } else if (grade == 4) {
            return "Добре";
        } else if (grade == 3) {
            return "Задовільно";
        } else if (grade == 2) {
            return "Погано";
        } else if (grade == 1) {
            return "Дуже погано";
        } else {
            return "Неправильна оцінка";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть оцінку від 1 до 5 : ");
        int grade = scanner.nextInt();

        String result = getGrade(grade);
        System.out.println(result);

        scanner.close();
    }
}

