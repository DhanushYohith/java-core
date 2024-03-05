package com.learning.core.day3;

public class D03P04 {
	public static void main(String[] args) {
        int[] array = {4, 2, 7, 5, 9, 2, 7, 4}; // Example
        int result = findFirstRepeatingElement(array);
        
        if (result != -1) {
            System.out.println("The first repeating element is: " + result);
        } else {
            System.out.println("No repeating elements found.");
        }
    }

    public static int findFirstRepeatingElement(int[] array) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : array) {
            // If already present in the countMap, it's repeating
            if (countMap.containsKey(num)) {
                return num;
            } else {
                // Otherwise, add the number to the countMap
                countMap.put(num, 1);
            }
        }

        // If no repeating element is found
        return -1;
	}

}
