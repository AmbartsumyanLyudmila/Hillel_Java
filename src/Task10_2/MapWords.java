package Task10_2;

import java.util.HashMap;
import java.util.Map;

public class MapWords {
    public static Map<String, String> createMap(String[] string) {
        Map<String, String> result = new HashMap<>();

        for (int i = 0; i < string.length; i++) {
            String word = string[i];
            //take first symbol
            String first = String.valueOf(word.charAt(0));
            //take latest symbol
            String last = String.valueOf(word.charAt(word.length() - 1));
            result.put(first, last);
        }
        return result;
    }

    public static void main(String[] args) {
        String[] array1 = {"code", "bug"};
        String[] array2 = {"man", "moon", "main"};
        String[] array3 = {"man", "moon", "good", "night"};
        Map<String, String> result1 = createMap(array1);
        Map<String, String> result2 = createMap(array2);
        Map<String, String> result3 = createMap(array3);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
