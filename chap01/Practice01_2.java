package chap01;

public class Practice01_2 {
    public static void main(String[] args) {
        int max = maxValue(20, 31, 15, 31, 7);
        System.out.println("최댓값 : " + max);
    }

    public static int maxValue(int data1, int data2, int data3, int data4, int data5) {
        int max = data1;

        if (data2 >= max) {
            max = data2;
        }

        if (data3 >= max) {
            max = data3;
        }

        if (data4 >= max) {
            max = data4;
        }

        if (data5 >= max) {
            max = data5;
        }

        return max;
    }

}
