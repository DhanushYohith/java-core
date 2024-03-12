package com.learning.core.day7;

import java.util.Stack;

public class D07P05 {
    public static void reverseStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            // Pop the top element
            int top = stack.pop();
            // Reverse the remaining stack
            reverseStack(stack);
            // Push the top element to the bottom of the stack
            insertAtBottom(stack, top);
        }
    }

    public static void insertAtBottom(Stack<Integer> stack, int item) {
        if (stack.isEmpty()) {
            stack.push(item);
        } else {
            // Pop the top element
            int top = stack.pop();
            // Recursively insert the item at the bottom
            insertAtBottom(stack, item);
            // Push the previously popped element back to the stack
            stack.push(top);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Original Stack: " + stack);
        
        // Reverse the stack
        reverseStack(stack);

        System.out.println("Reversed Stack: " + stack);
    }
}
