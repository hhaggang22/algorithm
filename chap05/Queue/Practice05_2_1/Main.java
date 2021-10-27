package chap05.Queue.Practice05_2_1;

public class Main {
    public static void main(String[] args) {
        Practice05_2_1_array queue = new Practice05_2_1_array(5);
        queue.enqueue(1000);
        queue.enqueue(2000);
        queue.enqueue(3000);
        queue.enqueue(4000);
        queue.enqueue(5000);

        queue.printAll();
    }

}
