package com.learning.core.day6;
import java.util.Hashtable;
import java.util.Scanner;

@SuppressWarnings("deprecation")
class Employee {
    private int id;
    private String name;
    private String department;
    private String designation;

    public Employee(int id, String name, String department, String designation) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getDesignation() {
        return designation;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + designation + " " + department;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Employee employee = (Employee) obj;
        return id == employee.id;
    }
}

public class D06P11 {
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

        // Search for a specific employee by ID
        Scanner sc = new Scanner(System.in);
        
        int searchId = sc.nextInt();
        if (employeeTable.containsKey(searchId)) {
            Employee foundEmployee = employeeTable.get(searchId);
            System.out.println(foundEmployee);
        } else {
            System.out.println("Employee with ID " + searchId + " not found.");
        }
        sc.close();
    }
}




