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
        String[] input1 = {"a", "bb", "a", "bb"};
        String[] input2 = {"this", "and", "that", "and"};
        String[] input3 = {"code", "code", "code", "bug"};

        Map<String, Integer> output1 = getLengthOfStrings(input1);
        Map<String, Integer> output2 = getLengthOfStrings(input2);
        Map<String, Integer> output3 = getLengthOfStrings(input3);
        System.out.println(output3);
        System.out.println(output2);
        System.out.println(output1);
    }
}

