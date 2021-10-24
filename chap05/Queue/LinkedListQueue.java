package chap05.Queue;

public class LinkedListQueue {
    private Node front = null;
    private Node rear = null;
    private Node peek = null;

    private class Node {
        private Object value;
        private Node next;

        Node(Object value) {
            this.value = value;
        }

        private Object getValue() {
            return this.value;
        }
    }

    public void enqueue(Object value){
        if(front == null){
            front = new Node(value);
            peek = front; 
            rear = front;
        }else{
            rear.next = new Node(value);
            rear = rear.next;
        }
    }

}
