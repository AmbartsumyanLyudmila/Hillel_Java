package Task10_1;

import java.util.HashMap;
import java.util.Map;

public class StringLength {
    //Map<String, Integer> type that method returns
    //getLengthOfStrings name of method
    public static Map<String, Integer> getLengthOfStrings(String[] strings) {
        Map<String, Integer> result = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            result.put(strings[i], strings[i].length());
        }

        return result;
    }

    public static void main(String[] args) {
        String[] array1 = {"a", "bb", "a", "bb"};
        String[] array2 = {"this", "and", "that", "and"};
        String[] array3= {"code", "code", "code", "bug"};

        Map<String, Integer> result1 = getLengthOfStrings(array1);
        Map<String, Integer> result2 = getLengthOfStrings(array2);
        Map<String, Integer> result3 = getLengthOfStrings(array3);
        System.out.println(result3);
        System.out.println(result2);
        System.out.println(result1);
    }
}

