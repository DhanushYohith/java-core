package com.learning.core.day2;
import java.util.Scanner;

public class D02P10 {
	
	public static void main(String[] args) {
		// reverse the number entered
		Scanner ip = new Scanner(System.in);
		int num = ip.nextInt();
		int sum=0;
		
		while (num > 0) {
			int rem = num%10;
			sum = sum*10 + rem;
			num = num / 10;
		}
		System.out.print("Reversed digit:"+ sum);	
		ip.close();
	}
}
