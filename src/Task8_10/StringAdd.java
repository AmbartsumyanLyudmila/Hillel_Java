package Task8_10;

public class StringAdd {
    public static boolean endsWith(String str1, String str2) {
        String lowerStr1 = str1.toLowerCase();
        String lowerStr2 = str2.toLowerCase();

        return lowerStr1.endsWith(lowerStr2) || lowerStr2.endsWith(lowerStr1);
    }
    public static void main(String[] args) {
        System.out.println(endsWith("AbC", "HiaBc"));
        System.out.println(endsWith("abc", "abXabc"));
        System.out.println(endsWith("Hiabc", "abc"));
        System.out.println(endsWith("A111a", "a111A"));
        System.out.println(endsWith(" ", " "));
        System.out.println(endsWith("", ""));
        System.out.println(endsWith("112", "aaa"));
    }


}
