package com.univerityportal;

public class Employee extends person {
    private int  employeeID;
    private String department;

    public Employee(int id, String name, int age, String gender, int employeeID, String department) {
        super(id, name, age, gender);
        this.employeeID = employeeID;
        this.department = department;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
    }
}

