package com.learning.core.day3;
import java.util.Scanner;
public class D03P02 {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25}; // Predefined array of 5 elements

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 40:");
        int userInput = scanner.nextInt();

        boolean found = false;

        // Checking if userInput matches any element in the array
        for (int i = 0; i < numbers.length; i++) {
            if (userInput == numbers[i]) {
                found = true;
                break;
            }
        }

        // Printing "Bingo" if userInput is found in the array
        if (found) {
            System.out.println("Bingo!");
        } else {
            System.out.println("Number not found.");
        }
        scanner.close();
    }
}
