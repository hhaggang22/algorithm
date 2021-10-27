package chap05.Queue.Practice05_2_2;

public class Practice05_2_2 {
    private Node front = null;
    private Node rear = null;
    private Node peek = null;

    private class Node {
        private Object value;
        private Node next;

        Node(Object value) {
            this.value = value;
        }

        private Object getValue() {
            return this.value;
        }
    }

    public void enqueue(Object value) {
        if (front == null) {
            front = new Node(value);
            rear = front;
            peek = front;
        } else {
            rear.next = new Node(value);
            rear = rear.next;
        }
    }

    public Object dequeue() {
        Object value = peek.getValue();
        Node temp = front;

        front = front.next;
        peek = front;
        temp = null;

        return value;
    }

    public Object peek() {
        return peek.getValue();
    }

    public void getLeft() {
        Node pnext = peek.next;
        int count = 0;

        while (pnext.next != null) {
            if (pnext != null) {
                System.out.println("대기인원있음");
                count++;
                pnext = pnext.next;
            } else {
                System.out.println("대기인원없음");
                pnext = pnext.next;
            }
        }
        if (pnext != null) {
            count++;
        }

        System.out.println("대기인원은 " + count + "명 입니다.");
    }

}
