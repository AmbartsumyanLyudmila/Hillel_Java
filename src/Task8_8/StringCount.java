package Task8_8;

public class StringCount {
    public static int countHi(String array) {
        int count = 0;

        for (int i = 0; i < array.length() - 1; i++) {
            if (array.charAt(i) == 'h' && array.charAt(i + 1) == 'i') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countHi("abc hi ho"));
        System.out.println(countHi("ABChi hi"));
        System.out.println(countHi("hihi"));
        System.out.println(countHi("hiihihihihihihihihihihihihihihih"));
        System.out.println(countHi(""));
    }


}
