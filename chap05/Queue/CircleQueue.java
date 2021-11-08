package chap05.Queue;

public class CircleQueue {
    private Object[] arr;
    private int MAX_QUEUE_SIZE;
    private int front = 0; // 삭제를 위한 지표
    private int rear = 0; // 삽입을 위한 지표

    CircleQueue(int size) {
        this.MAX_QUEUE_SIZE = size + 1;
        this.arr = new Object[this.MAX_QUEUE_SIZE];
    }

    public void enqueue(Object value) {
        if ((rear + 1) % MAX_QUEUE_SIZE == front) {
            throw new ArrayIndexOutOfBoundsException();
        }
        rear = (rear + 1) % MAX_QUEUE_SIZE;
        arr[rear] = value;
    }

    public Object dequeue() {
        if (empty()) {
            throw new ArrayIndexOutOfBoundsException();
        }

        front = (front + 1) % MAX_QUEUE_SIZE;
        Object value = arr[front];
        arr[front] = null;

        return value;
    }

    public boolean empty() {
        return front == rear;
    }

}
