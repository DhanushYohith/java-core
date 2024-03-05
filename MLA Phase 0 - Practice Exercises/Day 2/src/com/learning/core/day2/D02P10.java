package com.learning.core.day2;
import java.util.Scanner;
public class D02P10 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int num = ip.nextInt();
		int reverse = 0;
		while (num != 0) {
			
			int rem = num %10;
			reverse = reverse*10 + rem;
			num = num/10;	
		}
		System.out.println("REverse: "+reverse);		
	}
}
