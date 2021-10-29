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

}
