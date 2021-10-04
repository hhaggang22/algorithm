package chap04;

import java.util.*;

public class Practice04_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("x를 입력해주세요.");
        int x = scanner.nextInt();

        System.out.println("n을 입력해주세요.");
        int n = scanner.nextInt();

        System.out.println(String.format("result of %s is, ", squared(x, n)));

    }

    private static int squared(int x, int n) {
        if(n == 0){
            return 1;
        }
        else if(n == 1){
            return x;
        }
        
        return x * squared(x, n-1);
    }

}
