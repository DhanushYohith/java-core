package com.learning.core.day2;
import java.util.Scanner;
public class D02P12 {
	
    public static void main(String[] args) {
    	Scanner ip = new Scanner(System.in);
        int number = ip.nextInt();
        int i = number, j;

        while (i > 0) {
            j = 0;
            while (j++ < number - i) {
                System.out.print(" ");
            }
            j = 0;
            while (j++ < (i * 2) - 1) {
                System.out.print("*");
            }
            System.out.println();
            i--;
        }
    }	

}
