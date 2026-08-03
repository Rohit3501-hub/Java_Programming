package EmployeeSalaryManagement;

public abstract class Employee {
    private int employeeId;
    private String employeeName;
    private String department;

    public Employee(int employeeId, String employeeName, String department) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Department: " + department);

    }

    abstract double calculateSalary();

}