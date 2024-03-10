package com.learning.core.day5;

import java.util.*;

public class D05P09 {
 public static void main(String[] args) {
     TreeSet<Person> treeSet = new TreeSet<>();

     // Adding predefined information of 6 person details
     treeSet.add(new Person("John", 1, 30, 5000.0));
     treeSet.add(new Person("Jane", 2, 25, 6000.0));
     treeSet.add(new Person("Jack", 3, 28, 5500.0));
     treeSet.add(new Person("Jones", 4, 22, 6999.0));
     treeSet.add(new Person("Jill", 5, 35, 7500.0));
     treeSet.add(new Person("Jake", 6, 32, 6200.0));


     // Printing the sum of all salaries
     double sum = 0;
     for (Person person : treeSet) {
         sum += person.getSalary();
     }
     System.out.println("Sum of all salaries: " + sum);
 }
}