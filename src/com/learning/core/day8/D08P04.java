package com.learning.core.day8;
import java.util.LinkedList;
import java.util.Queue;

public class D08P04 {
    public static void main(String[] args) {
        
        String input1 = "Yellow Green Pink Black Blue White";
        System.out.println("Input 1: " + input1);
        System.out.println("Output 1: " + checkQueueEmpty(input1));

        
        String input2 = "[]";
        System.out.println("Input 2: " + input2);
        System.out.println("Output 2: " + checkQueueEmpty(input2));
    }

    public static String checkQueueEmpty(String input) {
       
        String[] elements = input.split("\\s+");
        Queue<String> queue = new LinkedList<>();

       
        for (String element : elements) {
           
            if (!element.equals("[]")) {
                queue.add(element);
            }
        }
        
        if (queue.isEmpty()) {
            return "Empty";
        } else {
            return "Not Empty";
        }
    }
}