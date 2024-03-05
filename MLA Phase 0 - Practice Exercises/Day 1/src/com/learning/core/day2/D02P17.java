package com.learning.core.day2;
import java.util.Scanner;
public class D02P17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting the value of n from the user
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


}
