package com.learning.core.day3;

public class D03P09 {
	public static void main(String[] args) {
        String input = "abcdabcdabcdabcd";
        System.out.println("Input string: " + input);
        boolean result = canDivideIntoFourDistinctStrings(input);
        if (result) {
            System.out.println("The string can be divided into four distinct substrings.");
        } else {
            System.out.println("The string cannot be divided into four distinct substrings.");
        }
    }

    public static boolean canDivideIntoFourDistinctStrings(String str) {
        // Check if the length of the string is divisible by 4
        if (str.length() % 4 != 0) {
            return false;
        }

        // Divide the string into four substrings and check if each substring is distinct
        int substringLength = str.length() / 4;
        Set<String> substrings = new HashSet<>();
        for (int i = 0; i < str.length(); i += substringLength) {
            String substring = str.substring(i, i + substringLength);
            if (!substrings.add(substring)) {
                // If any substring is not distinct, return false
                return false;
            }
        }

        // If all substrings are distinct, return true
        return true;		
		
		
	}	

}
