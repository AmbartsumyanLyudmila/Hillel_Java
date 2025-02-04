package Task3;

import java.util.Scanner;

public class NumberPower {
    public static int numPower(int a, int b) {
        if (b == 0) {
            return 1;
        } else {
            return (a * numPower(a, b - 1));
        }
    }
    public static void main (String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a ==>");
        int a = scanner.nextInt();
        System.out.println("Enter b ==>");
        int b = scanner.nextInt();

        System.out.println(a+"^"+b+" = "+numPower(a,b));
    }
}
