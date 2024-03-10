package com.learning.core.day2;
import java.util.Scanner;

public class D02P08 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter L: "); 		
		int l = sc.nextInt();
		System.out.print("Enter R: ");
		int r = sc.nextInt();
		int sum=0 , i=l;
				
		while(i<=r) {
			sum = sum+i;
			i++;
		}
		System.out.print(sum);
		sc.close();
	}

}
