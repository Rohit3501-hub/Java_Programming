package com.univerityportal;

public class Professor extends Employee {
    private String Specialization;
    private double salary;

    public Professor(int id, String name, int age, String gender, int employeeID, String department, String specialization, double salary) {
        super(id, name, age, gender, employeeID, department);
        this.Specialization = specialization;
        this.salary = salary;
    }
    @Override
    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("Specialization: " + Specialization);
        System.out.println("Salary: " + salary);
    }
}
