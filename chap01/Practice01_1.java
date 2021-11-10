package chap01;

public class Practice01_1 {
    public static void main(String[] args) {
        int min = minValue(5, 9, 2, 13);
        System.out.println("최솟값 : " + min);
    }

    public static int minValue(int data1, int data2, int data3, int data4) {
        int min = data1;

        if (data2 < min) {
            min = data2;
        }

        if (data3 < min) {
            min = data3;
        }

        if (data4 < min) {
            min = data4;
        }

        return min;
    }

}
