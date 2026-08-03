package JavaAssessmentPaper;

public class Employee {
    private int empId;
    private String empName;
    private double salary;

    public Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public void display() {
        if(salary > 40000){
            System.out.println("Employee ID: " + empId);
            System.out.println("Employee Name: " + empName);
            System.out.println("Salary: " + salary);
            System.out.println("***********************************");

        }
    }

    public static void main(String[] args) {
        Employee[] employee = new Employee[5];
        employee[0] = new Employee(101, "Ajay", 39000);
        employee[1] = new Employee(102, "Vijay", 35000);
        employee[2] = new Employee(103, "Sanjay", 55000);
        employee[3] = new Employee(104, "Rajay", 60000);
        employee[4] = new Employee(105, "Jayay", 65000);
        for (Employee emp : employee) {
            emp.display();
        }
    }

}
