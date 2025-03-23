package Task10_8;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetUnification {
    public static void main(String[] args) {
        TreeSet<Integer> treeSetA = new TreeSet<>(Set.of(1, 2, 3));
        TreeSet<Integer> treeSetB = new TreeSet<>(Set.of(3, 4, 5));
        TreeSet<Integer> result = new TreeSet<>();
        result.addAll(treeSetA);
        result.addAll(treeSetB);
        System.out.println("Tree Set unification: " + result);
    }
}

