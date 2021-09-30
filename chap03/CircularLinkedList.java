package chap03;

public class CircularLinkedList {
    private Node head;
    private Node tail;

    CircularLinkedList(){
        this.head = null;
        this.tail = null;
    }

    class Node{
        private int value; 
        private Node next;

        Node(int value){
            this.value = value;
            this.next = null;
        }

        public int getValue(){
            return this.value;
        }
    }

    public void append(int value){
        if(this.head == null && this.tail == null){
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

    
}
