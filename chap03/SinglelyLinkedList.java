package chap03;

public class SinglelyLinkedList {
    private Node head;

    SinglelyLinkedList() {
        this.head = null;
    }

    SinglelyLinkedList(int value) {
        this.head = new Node(value, null);
    }

    // Node 내부 클래스로 선언
    class Node {
        private int value;
        private Node next;

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public int getValue() {
            return this.value;
        }
    }

    public Node getHead() {
        return this.head;
    }

    // 연결리스트 맨 끝에 노드 추가
    public void append(int value) {
        // 노드가 아무것도 없을 때
        if (this.head == null) {
            this.head = new Node(value, null);
            return;
        }

        // 노드가 이미 존재할 때
        Node pointer = this.head;
        while (pointer.next != null) {
            pointer = pointer.next;
        }

        pointer.next = new Node(value, null);
    }

    // 모든 노드를 출력하는 함수
    public void printAll() {
        Node pointer = this.head;

        StringBuilder builder = new StringBuilder();
        while (pointer.next != null) {
            builder.append(pointer.getValue());
            builder.append("->");
            pointer = pointer.next;
        }

        System.out.println(builder.toString());
    }
}
