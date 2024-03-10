package com.learning.core.day2;
import java.util.Scanner;
public class D02P02 {
	
	public static void main(String args[]) {
		
		//Print Even numbers
		Scanner sc = new Scanner(System.in);
		System.out.println("Number: ");
		int num = sc.nextInt();
		for(int i=0;i<=num;i++) {
			if (i%2==0)
				System.out.print(i+" ");			
		}
		sc.close();
	}
}
