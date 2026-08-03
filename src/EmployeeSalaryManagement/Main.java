package EmployeeSalaryManagement;

public class Main {
    public static void main(String[] args) {
        PermanentEmployee employee =
                new PermanentEmployee(101, "Rohit Parmar", "IT", 50000, 10000, 2000);

        ContractEmployee contractEmployee =
                new ContractEmployee(102, "Sujay ", "HR", 30000, 5000);

        employee.displayEmployeeDetails();
        contractEmployee.displayEmployeeDetails();

    }


}

