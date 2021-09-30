package chap03.Practice;

public class Practice03_2 {
    public static void main(String[] args) {
        CircularDoubleLinkedList circularDoubleLinkedList = new CircularDoubleLinkedList();

        circularDoubleLinkedList.append(2);
        circularDoubleLinkedList.append(7);
        circularDoubleLinkedList.append(4);
        circularDoubleLinkedList.append(9);

        circularDoubleLinkedList.search(10);
        circularDoubleLinkedList.printAll();
    }
}