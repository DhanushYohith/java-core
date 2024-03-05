package com.learning.core.day2;
import java.util.Scanner;
public class D02P11 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
        int rows = ip.nextInt();

        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d ", i);
            }
            System.out.println();
        }

	}
}
