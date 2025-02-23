package Task7_1;


public class StringRepeat {
    public static String repeatEnd(String line, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int k = line.length() - n; k < line.length(); k++) {
                result.append(line.charAt(k));
            }

        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(repeatEnd("MyWorld", 3));
        System.out.println(repeatEnd("MyWorld", 2));
        System.out.println(repeatEnd("MyWorld", 1));
    }

}
