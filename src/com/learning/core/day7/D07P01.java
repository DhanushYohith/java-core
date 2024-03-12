package com.learning.core.day7;

import java.util.Scanner;

class Node {
    double data;
    Node next;

    Node(double data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    private Node top;

    Stack() {
        this.top = null;
    }

    boolean isEmpty() {
        return top == null;
    }

    void push(double data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    double pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1; // Return a sentinel value
        } else {
            double poppedData = top.data;
            top = top.next;
            return poppedData;
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            Node current = top;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println("null");
        }
    }
}

public class D07P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack stack = new Stack();

        System.out.print("Enter elements separated by spaces: ");
        String[] inputs = scanner.nextLine().split(" ");

        for (String input : inputs) {
            stack.push(Double.parseDouble(input));
        }

        System.out.print("The Elements of the stack are: ");
        stack.display();

        @SuppressWarnings("unused")
		double popped1 = stack.pop();
        @SuppressWarnings("unused")
		double popped2 = stack.pop();

        System.out.print("After popping twice: ");
        stack.display();
        scanner.close();
    }
}

