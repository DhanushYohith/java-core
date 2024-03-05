package com.learning.core.day2;
import java.util.Scanner;
public class D02P14 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Getting the number from the user
	        System.out.print("num: ");
	        double number = sc.nextDouble();

	        // Getting the power from the user
	        System.out.print("power: ");
	        int power = sc.nextInt();

	        // Calculating the result
	        double result = Math.pow(number, power);

	        // Printing the result
	        System.out.println(result);

	    }
}
	

