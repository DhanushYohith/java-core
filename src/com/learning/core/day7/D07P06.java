package com.learning.core.day7;

import java.util.Stack;

public class D07P06 {
    private Stack<Integer> mainStack;
    private Stack<Integer> minStack;

    public void MinimumElementStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int value) {
        mainStack.push(value);
        if (minStack.isEmpty() || value <= minStack.peek()) {
            minStack.push(value);
        }
    }

    public int pop() {
        if (mainStack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        int poppedValue = mainStack.pop();
        if (poppedValue == minStack.peek()) {
            minStack.pop();
        }
        return poppedValue;
    }

    public int getMinimum() {
        if (minStack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinimumElementStack stack = new MinimumElementStack();
        stack.push(3);
        stack.push(5);
        stack.push(2);
        stack.push(1);
        stack.push(6);

        System.out.println("Minimum element in the stack: " + stack.getMinimum());

        stack.pop();
        stack.pop();

        System.out.println("Minimum element in the stack after popping: " + stack.getMinimum());
    }
}


