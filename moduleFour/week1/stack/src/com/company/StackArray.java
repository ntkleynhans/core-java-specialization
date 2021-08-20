package com.company;

import java.util.LinkedList;

public class StackArray<E> implements Stack<E> {
    private final LinkedList<E> stack;

    public StackArray() {
        stack = new LinkedList<>();
    }

    public void push(E value) {
        stack.push(value);
    }

    public E pop() {
        return stack.pop();
    }
}
