package Task6_1;

public class ArrayAverage {
    public static double findAverage(int[] number) {
        int sum=0;
        for (int i = 0; i < number.length; i++) {
            int num = number[i];
            sum += num;
        }
        return (double) sum/ number.length;
    }
    public static void main(String[] args) {
        int[] number={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21};
        System.out.println("ArrayAverage = " + findAverage(number));
    }
}
