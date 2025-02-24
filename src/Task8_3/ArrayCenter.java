package Task8_3;

public class ArrayCenter {
    public static int centeredAverage(int[] array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (array[i] < min) min = array[i];
            if (array[i] > max) max = array[i];
        }
        return (sum - min - max) / (array.length - 2);
    }

    public static void main(String[] args) {
        System.out.println(centeredAverage(new int[]{1, 2, 3, 4, 100}));
        System.out.println(centeredAverage(new int[]{1, 1, 5, 5, 10, 8, 7}));
        System.out.println(centeredAverage(new int[]{-10, -4, -2, -4, -2, 0}));
    }
}
