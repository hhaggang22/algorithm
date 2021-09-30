package chap03.Practice;

//원형 이중 연결 리스트 
public class CircularDoubleLinkedList {
    private Node head;
    private Node tail;

    CircularDoubleLinkedList() {
        this.head = null;
        this.tail = null;
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
        tail.prev = head;
        this.tail.next = head;

        this.head.prev = this.tail;
    }

    // 삭제
    public void delete(int value) {

    }

    // 이미 생성된 노드에서 노드 존재 유무 검색
    public void search(int value) {
        if (this.head == null && this.tail == null) {
            System.out.println("노드 자체가 존재하지 않습니다");
            return;
        }

        Node temp = this.head.next;
        while (temp != this.head) { // tail 이 있음
            if (temp.getValue() != value) {
                temp = temp.next;
                continue; //다시 while문으로 돌아감
            }
            System.out.println(String.format("%s는 존재합니다.", value));
            break;
        }

        if (temp == this.head) { // head와 tail이 같은 경우 => 같은 노드가 없어서 이미 한바퀴 돌아온 경우
            System.out.println(String.format("%s는 존재하지 않습니다.", value));
        }
    }

    public void printAll() {
        Node pointer = this.head;

        StringBuilder builder = new StringBuilder();
        while (pointer != this.tail) {
            builder.append(pointer.getValue());
            builder.append("->");
            pointer = pointer.next;
        }
        builder.append(pointer.getValue());
        builder.append("(tail) -> ");

        builder.append(this.head.getValue());
        builder.append("(head)");

        System.out.println(builder.toString());
    }

}
