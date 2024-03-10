package com.learning.core.day2;
import java.util.Scanner;


public class D02P17 {
	public static void main(String[] args) {
		
		//Prime numbers from  1 to n
		Scanner ip = new Scanner(System.in);
		int num = ip.nextInt();
		boolean isPrime = false;
		
		for(int i=2;i<num;i++) {
			//prime
			for(int j=2;j<=i;j++) {
				if (i%j!=0)
					isPrime = true;
			
			if (isPrime) {
				System.out.print(j);
			}		
					
			}
		}
		ip.close();
		}						
}
