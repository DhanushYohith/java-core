package com.learning.core.day7;

import java.util.Scanner;
import java.util.Stack;

public class D07P04 {
    public static int evaluateExpression(String expression) {
        Stack<Integer> operandStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (ch == ' ') {
                continue;
            }
            if (Character.isDigit(ch)) {
                StringBuilder numBuilder = new StringBuilder();
                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    numBuilder.append(expression.charAt(i++));
                }
                i--;
                operandStack.push(Integer.parseInt(numBuilder.toString()));
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (!operatorStack.isEmpty() && precedence(operatorStack.peek()) >= precedence(ch)) {
                    int operand2 = operandStack.pop();
                    int operand1 = operandStack.pop();
                    char operator = operatorStack.pop();
                    operandStack.push(applyOperator(operator, operand1, operand2));
                }
                operatorStack.push(ch);
            }
        }

        while (!operatorStack.isEmpty()) {
            int operand2 = operandStack.pop();
            int operand1 = operandStack.pop();
            char operator = operatorStack.pop();
            operandStack.push(applyOperator(operator, operand1, operand2));
        }

        return operandStack.pop();
    }

    private static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return -1;
        }
    }

    private static int applyOperator(char operator, int operand1, int operand2) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                if (operand2 == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an expression: ");
        String expression = scanner.nextLine();
        
        int result = evaluateExpression(expression);
        System.out.println("Output: " + result);
        scanner.close();
    }
}
