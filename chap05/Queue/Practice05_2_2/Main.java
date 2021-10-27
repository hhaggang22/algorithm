package chap05.Queue.Practice05_2_2;

public class Main {
    public static void main(String[] args) {
        Practice05_2_2 queue = new Practice05_2_2();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        queue.getLeft(); // 대기인원 2명

        queue.dequeue(); // 1번 퇴장

        queue.getLeft(); // 대기인원 1명

        queue.enqueue(4);

        queue.getLeft(); // 대기인원 2명

        queue.dequeue(); // 2번 퇴장

        queue.getLeft(); // 대기인원 1명

        queue.dequeue(); // 3번 퇴장

        queue.getLeft(); // 대기인원 0명

        queue.enqueue(5);

        queue.getLeft(); // 대기인원 1명

    }
}
