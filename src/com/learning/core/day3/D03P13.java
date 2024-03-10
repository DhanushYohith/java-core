package com.learning.core.day3;

public class D03P13 {
	public static void main(String[] args) {
        String input = "Hello World! This is a test string.";
        String replaced = replaceSpaces(input);
        System.out.println("Original string: " + input);
        System.out.println("After replacing spaces: " + replaced);
    }

    public static String replaceSpaces(String str) {
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (ch == ' ') {
                result.append("%20");
            } else {
                result.append(ch);
            }
        }

        return result.toString();	
		
	}
}
