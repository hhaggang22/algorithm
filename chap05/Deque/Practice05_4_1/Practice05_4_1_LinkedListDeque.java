package chap05.Deque.Practice05_4_1;

public class Practice05_4_1_LinkedListDeque {
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

    public Object removeLast() {
        Object value = rear.getValue();
        Node temp = front;

        while (temp != null) {
            if (temp.next != rear) {
                temp = temp.next;
                continue;
            }
            rear = temp;
            rear.next = null;
        }
        return value;
    }

    public String printAll() {
        if (front == null) {
            return "deque is empty";
        }

        String datas = "";
        Node temp = front;

        for (; temp.next != null; temp = temp.next) { //for 문의 조건을 인덱스로 하지 않고도 이런식으로 사용될 수 있는점 확인!!
            Object value = temp.getValue();
            datas += String.format("%s->", value);
        }

        Object value = temp.getValue();
        datas += String.format("%s", value);

        return datas;
    }

}
