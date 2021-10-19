package chap05.Practice;

import java.util.*;

public class ArrayStack {
    private Object[] stack;
    private int top;

    ArrayStack(int length) {
        this.top = -1;
        this.stack = new Object[length];
    }

    // 데이터 삽입
    public void push(Object data) {
        if (top == stack.length - 1) {
            throw new StackOverflowError();
        }
        stack[++top] = data;
    }

    // 데이터 가져오기
    public Object pop() {
        if (top == -1) {
            throw new ArrayIndexOutOfBoundsException();
        }

        Object temp = stack[top];
        stack[top--] = null;
        return temp;
    }

    // 마지막 데이터 가져오기
    public Object peek() {
        return stack[top];
    }

    // 스택 비었는지 확인
    public boolean empty() {
        return top == -1;
    }

    // value가 stack에 포함되어 있는지 확인
    public boolean contains(Object value) {
        Object data = this.peek();
        while (data != value) {
            System.out.println("data is " + data.toString());
            if (top == 0) {
                return false;
            }
            --top;
            System.out.println(top);
            data = this.peek();
        }
        return true;
    }

}