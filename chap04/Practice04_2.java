package chap04;

public class Practice04_2 {
    public static void main(String[] args) {
        print(4);
    }

    static void blank(int blank) {
        if (blank == 0) {
            return;
        }
        System.out.print(" ");

        blank(blank - 1);

    }

    static void star(int star) {
        if (star == 0) {
            return;
        }
        System.out.print("* ");

        star(star - 1);

    }

    static void print(int n) {
        if (n == 0) {
            return; // 기저 조건
        }

        blank(n - 1);
        star(5 - n);
        System.out.println("");

        print(n - 1);
    }

}
