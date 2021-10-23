package chap05.Queue;

public class LinkedListQueue {
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

}
