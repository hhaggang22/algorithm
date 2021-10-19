package chap05.Practice;

public class Practice05_1_1 {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(4);
        stack.push("1");
        stack.push("3");
        stack.push("5");
        stack.push("7");

        System.out.println(stack.size());
    }
}
