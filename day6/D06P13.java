package com.learning.core.day6;
import java.util.Hashtable;

@SuppressWarnings("deprecation")

public class D06P13 {
    public static void main(String[] args) {
        Hashtable<Integer, Employee> employeeTable = new Hashtable<>();

        // Predefined information of 4 employee details
        Employee emp1 = new Employee(1001, "John", "HR", "HR Manager");
        Employee emp2 = new Employee(1002, "Alice", "Finance", "Finance Analyst");
        Employee emp3 = new Employee(1003, "Robert", "Development", "Product Manager");
        Employee emp4 = new Employee(1004, "Emily", "Marketing", "Marketing Specialist");

        // Storing employees in hashtable with ID as key
        employeeTable.put(emp1.getId(), emp1);
        employeeTable.put(emp2.getId(), emp2);
        employeeTable.put(emp3.getId(), emp3);
        employeeTable.put(emp4.getId(), emp4);

        // Get the number of keys in the Hashtable
        int numberOfKeys = employeeTable.size();
        System.out.println("Number of keys in the Hashtable: " + numberOfKeys);
    }
}
