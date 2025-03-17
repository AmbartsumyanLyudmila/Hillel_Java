package Task10_3;

import java.util.HashMap;
import java.util.Map;

public class WordsCount {
    //Map<String, Integer> type that method returns
    //countWords name of method
    public static Map<String, Integer> countWords(String[] words) {
        Map<String, Integer> counter = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (counter.containsKey(word)) {
                counter.put(word, counter.get(word) + 1);
            } else {
                counter.put(word, 1);
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        String[] array1 = {"a", "b", "a", "c", "b"};
        String[] array2 = {"c", "b", "a"};
        String[] array3 = {"c", "c", "c", "c"};
        Map<String, Integer> result1 = countWords(array1);
        Map<String, Integer> result2 = countWords(array2);
        Map<String, Integer> result3 = countWords(array3);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}