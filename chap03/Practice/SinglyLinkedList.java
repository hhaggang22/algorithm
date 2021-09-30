package chap03.Practice;

public class SinglyLinkedList {
    private Node head;

    SinglyLinkedList() {
        this.head = null;
    }

    SinglyLinkedList(int value) {
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
            if (pointer.getValue() == value) {
                return;
            }
            pointer = pointer.next;
        }

        if (pointer.getValue() == value) { // 항상 마지막 노드 때문에 조건이 있다면 한번 더 써줘야 한다.
            return;
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
        builder.append(pointer.getValue());
        System.out.println(builder.toString());
    }
}
