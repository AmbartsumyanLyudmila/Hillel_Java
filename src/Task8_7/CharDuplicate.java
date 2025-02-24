package Task8_7;

public class CharDuplicate {
    public static String doubleCharsWhile(String array) {
        String result = "";
        int i = 0;
        while (i < array.length()) {
            char c = array.charAt(i);
            result += c;
            result += c;
            i++;
        }
        return result;
    }
    public static void main(String[] args) {
        test("The");
        test("AAbb");
        test("Hi-There");
        test("");
    }

    public static void test(String str) {
        System.out.println("Source: " + str + "  =>  "+ "Target: " + doubleCharsWhile(str) );
    }
}
