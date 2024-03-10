package com.learning.core.day2;
import java.util.Scanner;

public class D02P12 {
	public static void main(String[] args) {
		/*Reversed pyramid with star..
		 			  *
		 			 ***	
		  			*****
		  		   *******
		  		  *********
		*/
		 Scanner ip = new Scanner(System.in);
		 System.out.print("Enter no: ");
		 int num = ip.nextInt();
		 for(int i=1;i<=num;i++) {
			 for(int j=0;j<num-i;j++)
				 System.out.print(" ");
			 for(int j=0;j<(i*2)-1;j++)
				 System.out.print("*");
			 System.out.println();
		 }		 
		 ip.close();
	}
}
