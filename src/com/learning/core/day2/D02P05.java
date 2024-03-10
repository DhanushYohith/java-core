package com.learning.core.day2;

import java.util.Scanner;
public class D02P05 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int num = ip.nextInt();
		String result = (num%5==0)?"Number is Divisible by 5":"Number is not Divisible by 5";
		System.out.println(result);
	
		ip.close();
	}
}


