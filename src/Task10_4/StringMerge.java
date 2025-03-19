package Task10_4;

import java.util.HashMap;
import java.util.Map;

public class StringMerge {
    public static Map<String, String> mergeStringsByFirstChar(String[] array) {
        Map<String, String> result = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i].isEmpty()) {
                continue;
            }
            String key = array[i].charAt(0) + "";
            if (result.containsKey(key)) {
                result.put(key, result.get(key) + array[i]);
            } else {
                result.put(key, array[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] arr1 = {"salt", "tea", "soda", "toast"};
        String[] arr2 = {"aa", "bb", "cc", "aAA", "cCC", "d"};
        String[] arr3 = {};
        String[] arr4 = {"", ""};
        String[] arr5 = {"sky", "", "sun", "world", ""};

        System.out.println(mergeStringsByFirstChar(arr1));
        System.out.println(mergeStringsByFirstChar(arr2));
        System.out.println(mergeStringsByFirstChar(arr3));
        System.out.println(mergeStringsByFirstChar(arr4));
        System.out.println(mergeStringsByFirstChar(arr5));
    }

}
