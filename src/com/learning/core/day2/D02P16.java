package com.learning.core.day2;
import java.util.Scanner;

public class D02P16 {
	public static void main(String[] args) {
		//Fibbonaci - num , a b sum 
		Scanner obj = new Scanner(System.in);
		int num = obj.nextInt();
		int a=0,b=1;
		int sum;
		System.out.print(a+" ");
		System.out.print(b+" ");
		while(num>0) {
			sum=a+b;
			a=b;
			b=sum;
			System.out.print(sum+" ");	
			num--;
		}		
		obj.close();		
	}
}
