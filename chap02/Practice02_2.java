package chap02;

public class Practice02_2 {
    public static void main(String[] args) {
        int[] arr = { 10, 11, 2, 5, 3, 3, 24, 15, 6, 9 };

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] >= max) {
                max = arr[i];
            }
        }

        System.out.println("min is " + min + ", max is " + max);
    }
}