package EmployeeSalaryManagement;

public class ContractEmployee extends Employee{
    private double hoursworked;
    private double  hourRate;

    public ContractEmployee(int employeeId, String employeeName, String department, double hoursworked, double hourRate) {
        super(employeeId, employeeName, department);
        this.hoursworked = hoursworked;
        this.hourRate = hourRate;
    }
    @Override
    public double calculateSalary() {
        double totalSalary = hoursworked * hourRate;
        System.out.println("Contract Employee Salary: " + totalSalary);
        return totalSalary;
    }
    public void displayEmployeeDetails(){
        System.out.println("Hours Worked: ₹ " + hoursworked);
        System.out.println("Hour Rate: " + hourRate);
        System.out.println("Total Salary: ₹ " + calculateSalary());
        System.out.println("------------***********************-----------------");
    }
}
