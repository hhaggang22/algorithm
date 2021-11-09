package chap05.Deque.Practice05_4_2;

public class main {
    public static void main(String[] args) {
        Practice05_4_2_LinkedListDeque deque = new Practice05_4_2_LinkedListDeque();

        deque.addFirst(100);
        deque.addFirst(200);
        deque.addLast(400);
        deque.addLast(300);
        // 현재까지 노드 순서 200->100->400->300

        System.out.println(deque.printAll());

        deque.removeFirst();
        deque.removeLast();

        System.out.println(deque.printAll());

        deque.removeFirst();
        deque.removeLast();

        System.out.println(deque.printAll());

        //deque.removeFirst();
        deque.removeLast();
    }
}
