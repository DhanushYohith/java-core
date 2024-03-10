package com.learning.core.day5;

import java.util.*;

// person class already defined in D05P06

public class D05P08 {
    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<>();

        // Adding predefined information of 6 person details
        treeSet.add(new Person("John", 1, 30, 5000));
        treeSet.add(new Person("Jane", 2, 25, 6000));
        treeSet.add(new Person("Jack", 3, 28, 5500));
        treeSet.add(new Person("Jones", 4, 22, 6999));
        treeSet.add(new Person("Jill", 5, 35, 7500));
        treeSet.add(new Person("Jake", 6, 32, 6200));

        // Printing all the names of the persons in uppercase
        for (Person person : treeSet) {
            System.out.println(person.getName().toUpperCase());
        }
    }
}

