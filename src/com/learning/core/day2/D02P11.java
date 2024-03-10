package com.learning.core.day2;
import java.util.Scanner;

public class D02P11 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		/*
		int sum =0;
		while(true) {
			System.out.print("Enter no: ");
			sum+=obj.nextInt();
			if (sum>100)
				break;			
		}		
		System.out.println("Done"+sum);
		
		System.out.println("NO: ");
		int num = obj.nextInt();
		int sum=0;
		for(int i=1;i<=num/2;i++) {
			if (num%i==0)
				sum+=i;
		}
		System.out.print(sum);
				
		//Right Angled triangle 
		ip = 5	
		op=	1
			2 2
			3 3 3
			4 4 4 4
			5 5 5 5 5
		*/
		int n = obj.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();			
		}
		obj.close();
	}
}
