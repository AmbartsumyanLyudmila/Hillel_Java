package Task10_7;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class NumbersCommon {
    public static Set<Integer> commonNumbers(Set<Integer> setA, Set<Integer> setB) {
        Set<Integer> commonArrayElement = new LinkedHashSet<>();
        Iterator<Integer> element = setA.iterator();
        while (element.hasNext()) {
            Integer number = element.next();
            if (setB.contains(number)) {
                commonArrayElement.add(number);
            }
        }
        return commonArrayElement;
    }

    public static void main(String[] args) {
        Set<Integer> setA = new LinkedHashSet<>(Set.of(1, 2, 3, 4));
        Set<Integer> setB = new LinkedHashSet<>(Set.of(3, 5, 6));
        Set<Integer> commonElements = commonNumbers(setA, setB);
        System.out.println("Common elements for setA[1,2,3,4] and setB[3,5,6]  =>  " + commonElements);
    }
}
