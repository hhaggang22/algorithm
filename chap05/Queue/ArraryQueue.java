package chap05.Queue;

public class ArraryQueue {
    private Object[] arr;
    private int MAX_QUEUE_SIZE;
    private int front;
    private int rear;
    private int peek;

    ArraryQueue(int size) {
        this.arr = new Object[size];
        this.MAX_QUEUE_SIZE = size;
        this.front = 0;
        this.rear = -1;
        this.peek = front;

    }

    public void enqueue(Object value) {
        if (MAX_QUEUE_SIZE - 1 == rear) {
            throw new StackOverflowError();
        }

        arr[++rear] = value;
    }

    public Object dequeue() {
        if (front >= MAX_QUEUE_SIZE) {
            throw new ArrayIndexOutOfBoundsException();
        }

        Object value = arr[peek];
        arr[peek] = null;
        peek = ++front;

        return value;
    }

    public Object peek() {
        return arr[peek];
    }

    public boolean isFull() {
        return MAX_QUEUE_SIZE - 1 == rear;
    }

}
