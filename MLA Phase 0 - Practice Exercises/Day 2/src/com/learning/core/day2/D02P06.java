package com.learning.core.day2;
import java.util.Scanner;

public class D02P06 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n = ip.nextInt();
		if (n==1)
			System.out.println("Monday");
		else if (n==2)
			System.out.println("Tuesday");
		else if (n==3)
			System.out.println("Wed");
		else if (n==4)
			System.out.println("Thu");
		else if (n==5)	
			System.out.println("fri");
		else if (n==6)
			System.out.println("sat");
		else if (n==7)
			System.out.println("sun");
		else
			System.out.println("Invalid input");
			
	}
}
