package com.learning.core.day7;

import java.util.Scanner;

public class D07P02 {
    @SuppressWarnings("unused")
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
        double popped2 = stack.pop();

        System.out.print("After popping twice: ");
        stack.display();
        scanner.close();
    }
}
