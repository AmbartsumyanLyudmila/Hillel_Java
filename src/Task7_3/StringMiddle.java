package Task7_3;

public class StringMiddle {
    public static boolean xyzMiddle(String str) {
        int ind = str.indexOf("xyz");
        int length = str.length();
        int leftLength = ind;
        int rightLength = length - (ind + 3);
        if (leftLength == rightLength) {
            return true;
        } else if (leftLength + 1 == rightLength) {
            return true;
        } else if (rightLength + 1 == leftLength) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(xyzMiddle("AAxyzBB"));
        System.out.println(xyzMiddle("AxyzBB"));
        System.out.println(xyzMiddle("AxyzBBB"));
        System.out.println(xyzMiddle("xyzB"));
        System.out.println(xyzMiddle("Axyz"));
        System.out.println(xyzMiddle("AAAxyz"));
    }
}
