package com.learning.core.day5;

import java.util.*;



public class D05P10 {
    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<>();

        // Adding predefined information of 6 person details
        treeSet.add(new Person("John", 1, 30, 5000));
        treeSet.add(new Person("Jane", 2, 25, 6000));
        treeSet.add(new Person("Jack", 3, 28, 5500));
        treeSet.add(new Person("Jones", 4, 22, 6999));
        treeSet.add(new Person("Jill", 5, 35, 7500));
        treeSet.add(new Person("Jake", 6, 32, 6200));

        // Printing the first person whose name starts with 'J'
        for (Person person : treeSet) {
            if (person.getName().startsWith("J")) {
                System.out.println(person);
                break;
            }
        }
    }
}
