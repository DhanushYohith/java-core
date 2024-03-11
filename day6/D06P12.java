package com.learning.core.day6;

import java.util.Hashtable;

@SuppressWarnings("deprecation")


public class D06P12 {
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

        // Add new employee details
        addNewEmployee(employeeTable, 1005, "Charles", "QA Lead", "Testing");

        // Print all employee details
        System.out.println("All Employee Details:");
        for (Employee employee : employeeTable.values()) {
            System.out.println(employee);
        }
    }

    private static void addNewEmployee(Hashtable<Integer, Employee> employeeTable, int id, String name,
            String department, String designation) {
        if (!employeeTable.containsKey(id)) {
            Employee newEmployee = new Employee(id, name, department, designation);
            employeeTable.put(id, newEmployee);
            System.out.println("New Employee Added: " + newEmployee);
        } else {
            System.out.println("Employee with ID " + id + " already exists.");
        }
    }
}

