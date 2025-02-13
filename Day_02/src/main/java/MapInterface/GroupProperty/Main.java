package MapInterface.GroupProperty;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );

        System.out.println("Grouped Employees: " + ObjectGrouping.groupByDepartment(employees));
    }
}
