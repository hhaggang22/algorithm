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

    public Node getHead() {
        return this.head;
    }

    // 삽입
    public void append(int value) {
        // 만약 노드가 아무것도 없으면 삽입하려는 노드가 첫 노드가 됨
        if (this.head == null) {
            this.head = new Node(value);
            return;
        }
        // 노드가 있을 때
        Node pointer = this.head;
        if (pointer.getValue() != value && pointer.next != null) {
            pointer = pointer.next;
        }

        Node newNode = new Node(value);
        newNode.prev = pointer;
        pointer.next = newNode;

    }

    public void printPrevNode(int value) {
        if (this.head == null) {
            System.out.println("노드가 아무것도 없음");
            return;
        }

        if (this.head.getValue() == value) {
            System.out.println(String.format("%s 이전의 노드가 없음", value));
            return;
        }

        Node pointer = this.head;
        while (pointer.getValue() != value && pointer.next != null) {
            pointer = pointer.next;
        }

        if (pointer == null) {
            System.out.println(String.format("노드 %s 는 존재하지 않음", value));
        } else {
            System.out.println(String.format("노드 %s의 이전 노드 값은 %s 임", value, pointer.prev.getValue()));
        }

    }

    public void printAll() {
        Node pointer = this.head;

        StringBuilder builder = new StringBuilder();
        while (pointer != null) {
            builder.append(pointer.getValue());
            builder.append("->");
            pointer = pointer.next;
        }
        System.out.println(builder.toString());
    }

}
