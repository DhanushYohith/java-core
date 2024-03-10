package com.learning.core.day2;
import java.util.Scanner;


public class D02P14 {
	public static void main(String[] args) {
		//power of each
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int pov = sc.nextInt();
		int result=1;
		for(int i=1;i<=pov;i++) {
			result=result*num;
		}
		System.out.print(result);
		sc.close();
	}
}
