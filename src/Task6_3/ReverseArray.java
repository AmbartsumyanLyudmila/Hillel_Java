package Task6_3;

public class ReverseArray {
    public static void getArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void getReverseArray(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] numbers = {0, 11, 22, 33, 44, 55, 66, 77, 88, 99, 111, 222, 333, 444, 555, 666, 777, 888, 999};
        System.out.print("Array : ");
        getArray(numbers);
        System.out.println();
        System.out.print("Reverse Array : ");
        getReverseArray(numbers);
    }
}
