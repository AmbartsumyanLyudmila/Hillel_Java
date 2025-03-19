package Task10_5;

import java.util.HashMap;
import java.util.Map;

public class StringBuild {
    public static String buildResultString(String[] array) {
        Map<String, Integer> countMap = new HashMap<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            String word = array[i];
            countMap.put(word, countMap.getOrDefault(word, 0) + 1);
            if (countMap.get(word) == 2) {
                result.append(word);
            }
        }
        return result.length() > 0 ? result.toString() : "";
    }
    public static void main(String[] args) {
        String[] arr1 = {"a", "b", "a"};
        String[] arr2 = {"a", "b", "a", "c", "a", "d", "a"};
        String[] arr3 = {"a", "", "a"};
        String[] arr4 = {"", ""};

        System.out.println(buildResultString(arr1));
        System.out.println(buildResultString(arr2));
        System.out.println(buildResultString(arr3));
        System.out.println(buildResultString(arr4));
    }
}
