package Task8_1;

public class CatDogArray {
    public static boolean catDog(String line) {
        char[] arr = line.toCharArray();
        int catCases = 0;
        int dogCases = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] == 'c' && arr[i + 1] == 'a' && arr[i + 2] == 't') {
                catCases++;
            }
            if (arr[i] == 'd' && arr[i + 1] == 'o' && arr[i + 2] == 'g') {
                dogCases++;
            }
        }

        return catCases == dogCases;
    }

    public static void main(String[] args) {
        System.out.println(catDog("catdog"));
        System.out.println(catDog("dogdog"));
        System.out.println(catDog("catcat"));
        System.out.println(catDog("1cat1cadodog"));
    }
}
