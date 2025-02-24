package Task8_9;

public class CodeCheck {
    public static int countCode(String array) {
        int container = 0;
        int i = 0;
        do {
            if (array.charAt(i) == 'c' && array.charAt(i + 1) == 'o' && array.charAt(i + 3) == 'e' && i < array.length() - 3) {
                container++;
            }
            i++;
        } while (i < array.length() - 2);
        return container;
    }

    public static void main(String[] args) {
        test("aaacodebbb");
        test("codexxcode");
        test("cozexxcope");
        test(" ");
        test("co e");
        test("co_e");
    }

    public static void test(String str) {
        int result = countCode(str);
        System.out.println("String: " + str + " => " + " count co?e=" + result);
    }


}
