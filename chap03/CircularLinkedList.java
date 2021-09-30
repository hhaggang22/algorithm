package chap03;

public class CircularLinkedList {
    private Node head;
    private Node tail;

    CircularLinkedList() {
        this.head = null;
        this.tail = null;
    }

    class Node {
        private int value;
        private Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }

        public int getValue() {
            return this.value;
        }
    }

    // 삽입
    public void append(int value) {
        if (this.head == null && this.tail == null) {
            Node node = new Node(value);
            this.head = node;
            this.tail = node;
            return;
        }

        Node pointer = this.tail;

        pointer.next = new Node(value);
        this.tail = pointer.next;
        this.tail.next = head;
    }

    // 삭제
    public void delete(int value) {
        Node pointer = this.head;
        // 삭제하려는 노드가 맨 앞의 노드일 때
        if (pointer.getValue() == value) {
            Node removeNode = this.head;
            this.head = this.head.next;

            removeNode = null;
            return;
        }

        Node temp = null;
        while (pointer.getValue() != value && pointer.next != this.tail) {
            temp = pointer;
            pointer = pointer.next;
        }

        if (pointer.next.getValue() == value) {
            this.tail = pointer;
            this.tail.next = head;
        } else {
            temp.next = pointer.next;
        }
        pointer = null;
    }

}
