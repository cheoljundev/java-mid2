package collection.deque;

import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack);

        // 꺼내지 않고 다음 꺼낼 요소를 확인
        System.out.println("stack.peek() = " + stack.peek());

        // 스택 요소 뽑기
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println(stack);
    }
}