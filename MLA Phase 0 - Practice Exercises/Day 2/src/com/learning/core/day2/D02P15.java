package com.learning.core.day2;
import java.util.Scanner;
public class D02P15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;


        for (int i = 0; i < n; i++) {
            
            int num = scanner.nextInt();

            if (num > 0) {
                positiveCount++;
            } 
            else if (num < 0) {
                negativeCount++;
            } 
            else {
                zeroCount++;
            }
        }

        
        System.out.println("Number of positive integers: " + positiveCount);
        System.out.println("Number of negative integers: " + negativeCount);
        System.out.println("Number of zero integers: " + zeroCount);
    }
}
