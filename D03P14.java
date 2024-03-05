package com.learning.core.day3;

public class D03P14 {
	public static void main(String[] args) {
	       int[] arr1 = {1, 3, 4, 5, 7};
	        int[] arr2 = {2, 3, 5, 6};

	        System.out.println("Array 1: " + Arrays.toString(arr1));
	        System.out.println("Array 2: " + Arrays.toString(arr2));

	        System.out.println("Union: " + Arrays.toString(findUnion(arr1, arr2)));
	        System.out.println("Intersection: " + Arrays.toString(findIntersection(arr1, arr2)));
	    }

	    public static int[] findUnion(int[] arr1, int[] arr2) {
	        Set<Integer> unionSet = new TreeSet<>();
	        int i = 0, j = 0;

	        while (i < arr1.length && j < arr2.length) {
	            if (arr1[i] < arr2[j]) {
	                unionSet.add(arr1[i]);
	                i++;
	            } else if (arr1[i] > arr2[j]) {
	                unionSet.add(arr2[j]);
	                j++;
	            } else {
	                unionSet.add(arr1[i]);
	                i++;
	                j++;
	            }
	        }

	        while (i < arr1.length) {
	            unionSet.add(arr1[i]);
	            i++;
	        }

	        while (j < arr2.length) {
	            unionSet.add(arr2[j]);
	            j++;
	        }

	        int[] union = new int[unionSet.size()];
	        int index = 0;
	        for (int num : unionSet) {
	            union[index++] = num;
	        }

	        return union;
	    }

	    public static int[] findIntersection(int[] arr1, int[] arr2) {
	        List<Integer> intersectionList = new ArrayList<>();
	        int i = 0, j = 0;

	        while (i < arr1.length && j < arr2.length) {
	            if (arr1[i] < arr2[j]) {
	                i++;
	            } else if (arr1[i] > arr2[j]) {
	                j++;
	            } else {
	                intersectionList.add(arr1[i]);
	                i++;
	                j++;
	            }
	        }

	        int[] intersection = new int[intersectionList.size()];
	        for (int k = 0; k < intersectionList.size(); k++) {
	            intersection[k] = intersectionList.get(k);
	        }

	        return intersection;		
		
		
	}
}
