package Task8_5;

import java.util.Arrays;

public class ArrayIgnore {
    public static int sumIgnoreSections(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 6) {
                while (i < array.length && array[i] != 7) {
                    i++;
                }
            } else {
                sum += array[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        test(new int[]{1, 2, 2});
        test(new int[]{1, 2, 2, 6, 99, 99, 7});
        test(new int[]{1, 1, 6, 7, 2});
        test(new int[]{});
    }

    public static void test(int[] array) {
        int result = sumIgnoreSections(array);
        System.out.println("Array: " + Arrays.toString(array) + " => " + result);
    }
}
