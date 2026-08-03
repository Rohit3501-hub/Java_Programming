package EmployeeSalaryManagement;

public class PermanentEmployee extends Employee {
    private double basicSalary;
    private double hra;
    private double bonus;

    public PermanentEmployee(int employeeId, String employeeName, String department, double basicSalary, double hra, double bonus) {
        super(employeeId, employeeName, department);
        this.basicSalary = basicSalary;
        this.hra = hra;
        this.bonus = bonus;
    }

    public double calculateSalary() {
        double totalSalary = basicSalary + hra + bonus;
        return totalSalary;

    }

    @Override
    public void displayEmployeeDetails() {
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateSalary());
    }
}
