package com.learning.core.day2;
import java.util.Scanner;
public class D02P13 {
	public static void main(String[] args) {
		//Factorial of a given number..
		Scanner ip = new Scanner(System.in);
		int num = ip.nextInt();
		int prod = 1;
		while(num >=1) {
			prod = prod*num;
			num--;					
		}
		System.out.print("Factorial: "+prod);
		ip.close();
	}
}
