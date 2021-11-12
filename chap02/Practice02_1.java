package chap02;

import java.util.*;

public class Practice02_1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int j = 0; j < arr.length; j++) { // 인덱스를 사용할 일이 없으니까 굳이 for 문을 쓰지 않고 foreach를 써도 좋았을 것 같다.
            sum += arr[j];
        }

        /*
         * foreach 사용해서 sum 구하기 for(int num : arr){ sum += num; }
         */

        System.err.println("sum is " + sum);

        scanner.close();

    }
}