package com.learning.core.day2;
import java.util.Scanner;
public class D02P03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op1 = sc.nextInt();
		int op2 = sc.nextInt();
		String opt = sc.next();
		
		switch (opt) {
			case "+" :
				System.out.println(op1+op2);
				break;
			case "-" :
				System.out.println(op1-op2);
				break;
			case "*" :
				System.out.println(op1*op2);
				break;
			case "/" :
				System.out.println(op1/op2);
				break;
		}
		sc.close();
		
	}
}
