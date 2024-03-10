package com.learning.core.day2;
import java.util.Scanner;


public class D02P09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=1;i<=num;i++) {
			int cube = i*i*i;
			System.out.print(cube+" ");
		sc.close();	
		}
	}
}
