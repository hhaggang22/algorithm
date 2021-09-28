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

    public void delete(int value) {
        Node pointer = this.head;

        // 맨 앞의 노드를 삭제
        if (pointer.getValue() == value) {
            Node removedNode = this.head;
            this.head = this.head.next;

            removedNode = null;
            return;
        }

        Node temp = pointer; // 삭제할 노드 앞의 노드를 가리키는 포인터
        if (pointer.getValue() != value && pointer.next != null) {
            temp = pointer;
            pointer = pointer.next;
        }

        if (pointer.next == null) { // 끝까지 갔다는 의미
            temp.next = null;
        } else {
            temp.next = pointer.next;
        }
        pointer = null;
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
