package chap03;

public class DoubleLinkedList {
    Node head = null;

    DoubleLinkedList() {
        this.head = null;
    }

    DoubleLinkedList(int value, Node head) {
        this.head = new Node(value, head, null);
    }

    class Node {
        private int value;
        private Node prev;
        private Node next;

        Node(int value) {
            this.value = value;
            this.prev = null;
            this.next = null;
        }

        Node(int value, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }

        public int getValue() {
            return this.value;
        }

    }

}
