package com.learning.core.day2;
import java.util.Scanner;

public class D02P15 {
	public static void main(String[] args) {
		//Count of +ve , -ve , 0s entered by the user
		Scanner obj = new Scanner(System.in);
		int freq = obj.nextInt();
		int pos=0 , neg=0 , zero=0;
		for(int i=1;i<=freq;i++) {
			int num = obj.nextInt();
			if(num > 0)
				pos +=1;
			else if (num == 0)
				zero+=1;
			else
				neg +=1;
		}
		System.out.println("NO.of positive integers: "+pos);
		System.out.println("NO.of negative integers: "+neg);
		System.out.println("NO.of zeroes: "+zero);
		obj.close();
	}
}
