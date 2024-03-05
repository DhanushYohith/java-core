package com.learning.core.day2;

import java.util.Scanner;

public class D02P09 {
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int num = ip.nextInt();
		int i= 1;
		while (i<num) {
			System.out.print(" "+i*i*i);
			i+=1;
		} 
	}

}
