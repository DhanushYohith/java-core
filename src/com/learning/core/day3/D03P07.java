package com.learning.core.day3;

public class D03P07 {
	public static void main(String[] args) {
        String str = "abc";
        System.out.println("All subsequences of the string \"" + str + "\":");
        printSubsequences(str);
    }

    public static void printSubsequences(String str) {
        printSubsequencesHelper(str, 0, "");
    }

    private static void printSubsequencesHelper(String str, int index, String current) {
        // Base case: when index reaches the length of the string
        if (index == str.length()) {
            System.out.println(current);
            return;
        }

        // Recursive case: include the current character and move to the next character
        printSubsequencesHelper(str, index + 1, current + str.charAt(index));

        // Recursive case: exclude the current character and move to the next character
        printSubsequencesHelper(str, index + 1, current);		
		
		
	}
}
