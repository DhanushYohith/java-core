package com.learning.core.day3;

public class D03P05 {

	public static void main(String[] args) {
        int[] array = {1, 2, 3}; // Example array
        List<List<Integer>> result = findDistinctCombinations(array);

        System.out.println("Distinct combinations of elements:");
        for (List<Integer> combination : result) {
            System.out.println(combination);
        }
    }

    public static List<List<Integer>> findDistinctCombinations(int[] array) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(array); // Sort the array to handle duplicate elements correctly
        findDistinctCombinationsHelper(array, 0, new ArrayList<>(), result);
        return result;
    }

    private static void findDistinctCombinationsHelper(int[] array, int index, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current));

        for (int i = index; i < array.length; i++) {
            // Skip duplicates to ensure distinct combinations
            if (i > index && array[i] == array[i - 1]) {
                continue;
            }
            current.add(array[i]);
            findDistinctCombinationsHelper(array, i + 1, current, result);
            current.remove(current.size() - 1);
        }
	}
}
