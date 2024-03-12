package com.learning.core.day7;

import java.util.Scanner;
import java.util.Stack;

public class D07P03 {
    public static String reverseString(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        Stack<Character> stack = new Stack<>();

        // Push each character onto the stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        StringBuilder reversed = new StringBuilder();

        // Pop characters from the stack to construct the reversed string
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String reversed = reverseString(input);
        System.out.println("Input: " + input);
        System.out.println("Reversed: " + reversed);
        scanner.close();
    }
}
