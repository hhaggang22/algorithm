package chap05.Queue;

public class Main_2 {
    public static void main(String[] args) {
        Practice05_2_1_LinkedList queue = new Practice05_2_1_LinkedList();

        queue.enqueue(1000);
        queue.enqueue(2000);
        queue.enqueue(3000);
        queue.enqueue(4000);
        queue.enqueue(5000);

        queue.printAll();
    }

}
