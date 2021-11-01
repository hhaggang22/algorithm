package chap05.Deque;

public class LinkedListDeque {
    private class Node {
        Object data = null;
        Node next = null;

        Node(Object data) {
            this.data = data;
        }

        private Object getValue() {
            return data;
        }
    }

    private Node front = null;
    private Node rear = null;

    public void addFirst(Object data) {
        Node node = new Node(data);
        if (front == null) {
            front = node;
            rear = front;
            return;
        }

        Node temp = front;
        front = node;
        front.next = temp;
    }

    public void addLast(Object data) {
        Node node = new Node(data);
        if (front == null) {
            front = node;
            rear = front;
            return;
        }

        rear.next = node;
        rear = rear.next;
    }

    public Object removeFirst() {
        Object value = front.getValue();
        front = front.next;

        return value;
    }

}
