package com.learning.core.day6;

import java.util.Hashtable;
import java.util.Map;

@SuppressWarnings("deprecation")

public class D06P14 {
    public static void main(String[] args) {
        // Predefined information of 4 employee details
        Employee emp1 = new Employee(1001, "John", "HR", "HR Manager");
        Employee emp2 = new Employee(1002, "Alice", "Finance", "Finance Analyst");
        Employee emp3 = new Employee(1003, "Robert", "Development", "Product Manager");
        Employee emp4 = new Employee(1004, "Emily", "Marketing", "Marketing Specialist");

        // Existing collection with some data
        Hashtable<Integer, Employee> existingCollection = new Hashtable<>();
        existingCollection.put(2001, new Employee(2001, "Henry", "Accountant", "HR"));
        existingCollection.put(2002, new Employee(2002, "Thomas", "QA Lead", "Testing"));

        // Adding employee details from the existing collection to a specific collection
        Hashtable<Integer, Employee> specificCollection = new Hashtable<>(existingCollection);
        specificCollection.put(emp1.getId(), emp1);
        specificCollection.put(emp2.getId(), emp2);
        specificCollection.put(emp3.getId(), emp3);
        specificCollection.put(emp4.getId(), emp4);

        // Printing employee details from the specific collection
        System.out.println("Employee details in the specific collection:");
        for (Map.Entry<Integer, Employee> entry : specificCollection.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}

