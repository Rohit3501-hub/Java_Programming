package ArrayList;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class Main {
        public static void main(String[] args) {
                ArrayList<Employee> employees = new ArrayList<>();
                employees.add(new Employee(101, "John Doe", 50000, "IT"));
                employees.add(new Employee(102, "Jane Smith", 60000, "HR"));
                employees.add(new Employee(103, "Mike Johnson", 55000, "Finance"));
                employees.add(new Employee(104, "Emily Davis", 70000, "IT"));
                employees.add(new Employee(105, "Sujay", 5000, "IT"));

                for (Employee employee : employees) {
                        System.out.println(employee);
                }
                Iterator<Employee> iterator = employees.iterator();
                while (iterator.hasNext()) {
                        Employee employee = iterator.next();
                        System.out.println(employee);
                }
                ListIterator<Employee> li = employees.listIterator(employees.size());
                while (li.hasPrevious()) {
                        Employee employee = li.previous();
                        System.out.println(employee);
                }
        }
}