package Task8_4;

import java.util.Arrays;

public class ArraySum {
    public static int sumWithoutUnlucky13(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 13) {
                i++;
            } else {
                sum += array[i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        test(new int[]{1, 2, 2, 1}); // 6
        test(new int[]{1, 1}); // 2
        test(new int[]{1, 2, 2, 1, 13}); // 6
        test(new int[]{}); // 0
    }

    public static void test(int[] array) {
        int result = sumWithoutUnlucky13(array);
        System.out.println("Array: " + Arrays.toString(array) + " => " + result);
    }
}
