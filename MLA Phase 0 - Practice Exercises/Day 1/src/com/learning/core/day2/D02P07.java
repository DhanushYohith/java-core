package com.learning.core.day2;
import java.util.Scanner;
public class D02P07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float percent = sc.nextFloat();
		if (percent>=60) 
			System.out.println("Grade A");
		
		else if (percent>=45)
			System.out.println("Grade B");
		else if (percent>=35)
			System.out.println("Grade C");
		else if (percent<35)
			System.out.println("Fail!");
		
	}

}
