package Task7_5;

public class StringLocation {
    public static boolean xyzThere(String line) {
        for (int i = 0; i < line.length() - 2; i++) {
            if (line.charAt(i) == 'x' && line.charAt(i + 1) == 'y' && line.charAt(i + 2) == 'z') {
                if (i == 0 || line.charAt(i - 1) != '.') {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(xyzThere("abcxyz"));
        System.out.println(xyzThere("abc.xyz"));
        System.out.println(xyzThere("xyz.abc"));
        System.out.println(xyzThere("xxyz."));
    }
}
