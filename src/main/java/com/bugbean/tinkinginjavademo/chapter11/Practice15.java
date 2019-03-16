package com.bugbean.tinkinginjavademo.chapter11;

import java.util.LinkedList;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-03-14 16:26
 */
public class Practice15 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("U");
        stack.push("n");
        stack.push("c");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push("e");
        stack.push("r");
        stack.push("t");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push("a");
        System.out.println(stack.pop());
        stack.push("i");
        System.out.println(stack.pop());
        stack.push("n");
        stack.push("t");
        stack.push("y");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push("~");
        stack.push("r");
        stack.push("u");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push("l");
        stack.push("e");
        stack.push("s");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}

class Stack<T> {
    private LinkedList<T> storage = new LinkedList<T>();

    public void push(T v) {
        storage.addFirst(v);
    }

    public T peek() {
        return storage.peek();
    }

    public T pop() {
        return storage.pop();
    }

    public boolean empty() {
        return storage.isEmpty();
    }

    @Override
    public String toString() {
        return storage.toString();
    }
}