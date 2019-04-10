package com.bugbean.tinkinginjavademo.chapter15;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-04-08 20:47
 */
public class Practice5 {
    public static void main(String[] args) {
        LinkedStack<String> linkedStack = new LinkedStack<>();
        for (String s :
                "Phasers or stun!".split(" ")) {
            linkedStack.push(s);
        }
        String s;
        while ((s = linkedStack.pop()) != null) {
            System.out.println(s);
        }
    }
}

class LinkedStack<T> {
    private class Node {
        T item;
        Node next;

        public Node() {
            item = null;
            next = null;
        }

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }

        boolean end() {
            return item == null && next == null;
        }
    }

    private Node top = new Node();

    public void push(T item) {
        top = new Node(item, top);
    }

    public T pop() {
        T result = top.item;
        if (!top.end()) {
            top = top.next;
        }
        return result;
    }
}
