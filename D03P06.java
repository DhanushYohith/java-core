package com.learning.core.day3;
import java.util.Scanner;
public class D03P06 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        //  input string
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        // Taking input for N
	        System.out.print("Enter the value of N: ");
	        int n = scanner.nextInt();

	        int count = countLastNVowels(input, n);
	        System.out.println("Count of last " + n + " vowels: " + count);
	    }

	    public static int countLastNVowels(String str, int n) {
	        str = str.toLowerCase(); // Convert the string to lowercase to handle both upper and lowercase vowels
	        int vowelCount = 0;
	        int lastIndex = str.length() - 1;

	        for (int i = lastIndex; i >= 0 && n > 0; i--) {
	            char ch = str.charAt(i);
	            if (isVowel(ch)) {
	                vowelCount++;
	                n--;
	            }
	        }

	        return vowelCount;
	    }

	    public static boolean isVowel(char ch) {
	        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	}

}
