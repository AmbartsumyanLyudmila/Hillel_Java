package Task10_6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberFavorite {
    public static int popularNumber(int[] number) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int i = 0; i < number.length; i++) {
            int num = number[i];
            if (countMap.containsKey(num)) {
                countMap.put(num, countMap.get(num) + 1);
            } else {
                countMap.put(num, 1);
            }
        }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(countMap.entrySet());
        int popularNumber = number[0];
        int count = 0;

        for (int i = 0; i < entryList.size(); i++) {
            Map.Entry<Integer, Integer> entry = entryList.get(i);
            if (entry.getValue() > count) {
                count = entry.getValue();
                popularNumber = entry.getKey();
            }
        }

        return popularNumber;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 1, 2, 2, 1, 2, 3, 3, 3};
        int[] arr2 = {0, 0, 2, 2, 1, 2, 0, 3};
        System.out.println(popularNumber(arr1));
        System.out.println(popularNumber(arr2));
    }
}
