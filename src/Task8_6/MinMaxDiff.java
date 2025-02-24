package Task8_6;

import java.util.Arrays;

public class MinMaxDiff {
    public static int differenceLargestSmallest(int[] array) {
        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            min = Math.min(min, array[i]);
            max = Math.max(max, array[i]);
        }
        return max - min;
    }

    public static void main(String[] args) {
        test(new int[]{10, 3, 5, 6}); // 7
        test(new int[]{7, 2, 10, 9}); // 8
        test(new int[]{2, 10, 7, 2}); // 8
        test(new int[]{5, 5}); // 0
        test(new int[]{0}); // 10
        test(new int[]{5000}); // 0
    }

    public static void test(int[] array) {
        int result = differenceLargestSmallest(array);
        System.out.println("Array: " + Arrays.toString(array) + " diff=> " + result);
    }
}
