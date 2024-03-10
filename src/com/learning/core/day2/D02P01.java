package com.learning.core.day2;
import java.util.Scanner;
public class D02P01 {
	public static void main(String[] args) {	
		Scanner ip = new Scanner(System.in);
		//no from userip: 1-12 , op :month
		
		int month = ip.nextInt();
		
		switch(month){
			
			case 1:
				System.out.println("Jan");
				break;
			case 2:
				System.out.println("FEb");
				break;
			case 3:
  				System.out.println("Mar");
				break;
			case 4:
				System.out.println("Apr");
				break;
			case 5:
				System.out.println("MAy");
				break;
			case 6:
				System.out.println("Jun");
				break;	
			case 7:
				System.out.println("Jul");
				break;
			case 8:
				System.out.println("Aug");
				break;
			case 9:
				System.out.println("sep");
				break;			
			case 10:
				System.out.println("oct");
				break;
			case 11:
				System.out.println("nov");
				break;
			case 12:
				System.out.println("dec");
				break;
			default: 
				System.out.println("Invalid Input!");	
		}
		ip.close();
		
}	

}
