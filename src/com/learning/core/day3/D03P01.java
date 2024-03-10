package com.learning.core.day3;
import java.util.Scanner;
public class D03P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

       
        int length = input.length();
        System.out.println("Length of the string: " + length);

        
        String upperCaseString = input.toUpperCase();
        System.out.println("Uppercase string: " + upperCaseString);

       
        boolean isPalindrome = checkPalindrome(input);
        if (isPalindrome) {
            System.out.println(" palindrome.");
        } else {
            System.out.println(" not a palindrome.");
        }
        scanner.close();
    }

  
    public static boolean checkPalindrome(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
        	
    }    
}
