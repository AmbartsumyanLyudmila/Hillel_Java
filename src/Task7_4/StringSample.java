package Task7_4;

public class StringSample {
    public static String zipZap(String line) {
        String result = "";
        for (int i = 0; i < line.length(); i++) {
            if (i < line.length() - 2 && line.charAt(i) == 'z' && line.charAt(i + 2) == 'p') {
                result += "z";
                result += "p";
                i += 2;
            } else {
                result += line.charAt(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(zipZap("zipXzap"));
        System.out.println(zipZap("zopzop"));
        System.out.println(zipZap("zzzopzop"));
        System.out.println(zipZap("aaaazzzopzppp"));
    }
}
