package com.learning.core.day2;
import java.util.Scanner;
public class D02P16 {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        
        System.out.println("The " + n + "th Fibonacci number is: " + fibonacci(n));


    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            int a = 0, b = 1, c = 0;
            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return b;
        }
    }	

}
