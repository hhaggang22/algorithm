package chap05.Deque.Practice05_4_2;

public class Practice05_4_2_LinkedListDeque {
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
        if (front == null) {
            throw new NullPointerException();
        }

        Object value = front.getValue();
        front = front.next;

        return value;
    }

    public Object removeLast() {
        if (front == null) {
            throw new NullPointerException();
        }

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

        // 다 삭제하고 노드 한개만 남았을 때 고려해야함!!!!!!!
        if (front == rear) {
            front = null;
            rear = null;
        }

        return value;
    }

    public String printAll() {
        if (front == null) {
            return "deque is empty";
        }

        String datas = "";
        Node temp = front;

        for (; temp.next != null; temp = temp.next) { // for 문의 조건을 인덱스로 하지 않고도 이런식으로 사용될 수 있는점 확인!!
            Object value = temp.getValue();
            datas += String.format("%s->", value);
        }

        Object value = temp.getValue();
        datas += String.format("%s", value);

        return datas;
    }

}
