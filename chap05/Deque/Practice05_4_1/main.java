package chap05.Deque.Practice05_4_1;

import java.util.Deque;

import chap05.Deque.LinkedListDeque;

public class main {
    public static void main(String[] args){
        Practice05_4_1_LinkedListDeque deque = new Practice05_4_1_LinkedListDeque();

        deque.addFirst(200);
        deque.addLast(300);
        deque.addFirst(400);
        deque.addLast(100);

        //현재까지 deque 모양 : 400->200->300->100

        System.out.println(deque.printAll());
    }
    
}
