package com.learning.core.day2;
import java.util.Scanner;
public class D02P04 {
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		int num1 = ip.nextInt();
		int num2 = ip.nextInt();
		int num3 = ip.nextInt();
		
		if (num1>num2 && num1>num3) 
				System.out.println("Max:"+num1);				
		else {
			if(num2>num1 && num2>num3)
				System.out.println("Max:"+num2);
			else
				System.out.println("Max:"+num3);
		}
		
	}
}
