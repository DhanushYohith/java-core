package com.learning.core.day8;
import java.util.LinkedList;
import java.util.Queue;

public class D08P05 {
    public static void main(String[] args) {
        
        String input2 = "2 7 9 4 6 5 10";
        System.out.println("Input 2: " + input2);
        printOddEvenQueues(input2);
    }

    public static void printOddEvenQueues(String input) {
        
        String[] elements = input.split("\\s+");
        Queue<Integer> oddQueue = new LinkedList<>();
        Queue<Integer> evenQueue = new LinkedList<>();

        
        for (String element : elements) {
            int num = Integer.parseInt(element);
            if (num % 2 == 0) {
                evenQueue.add(num);
            } else {
                oddQueue.add(num);
            }
        }

        
        System.out.print("Odd queue: ");
        while (!oddQueue.isEmpty()) {
            System.out.print(oddQueue.poll() + " ");
        }
        System.out.println();

       
        System.out.print("Even queue: ");
        while (!evenQueue.isEmpty()) {
            System.out.print(evenQueue.poll() + " ");
        }
        System.out.println();
    }
}
