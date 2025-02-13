package Task6_2;

import java.util.Arrays;

public class MinMaxValue {
    public static void main(String[] args) {
        int[] values = {7, 100, 1, 0, 8, 999, 22, 88, 9};
        int max = Arrays.stream(values).max().getAsInt();
        int min = Arrays.stream(values).min().getAsInt();
        System.out.println("Max value = " + max);
        System.out.println("Min value = " + min);
    }

}
