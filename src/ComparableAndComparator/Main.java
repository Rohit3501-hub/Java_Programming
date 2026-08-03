package ComparableAndComparator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public void main(String[] args) {

        List<Employee> employeeslist = new ArrayList<>();
        employeeslist.add(new Employee(101, "Rohit", 50000, "IT"));
        employeeslist.add(new Employee(105,"Sujay",45000,"Software Engineer"));
        employeeslist.add(new Employee(104,"Arun",48000,"Research"));
        employeeslist.add(new Employee(103,"Ajay", 35000,"IT"));
        employeeslist.add(new Employee(102,"Rahul",32000,"Software Engineer"));
        employeeslist.add(new Employee(106,"Vikas",40000,"Research"));
        employeeslist.add(new Employee(108,"Akash",25000,"Data Science"));
        employeeslist.add(new Employee(107,"Bhavna",42000,"IT"));

        employeeslist.sort(null);

        for(Employee e : employeeslist) {
            System.out.println(e);
        }
    }
}
