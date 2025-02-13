package MapInterface.GroupProperty;

public class Employee {
    String name, department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return name;
    }
}
