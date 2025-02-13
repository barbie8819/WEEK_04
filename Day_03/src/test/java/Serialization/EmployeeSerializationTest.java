package Serialization;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import java.util.*;
class EmployeeSerializationTest {
    @Test
    void testSaveAndLoadEmployees() throws IOException, ClassNotFoundException {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Alice", "HR", 50000));
        employees.add(new Employee(2, "Bob", "IT", 60000));

        String fileName = "C:/Users/scc/Desktop/CopiedTo.txt";
        EmployeeSerialization.saveEmployees(employees, fileName);

        List<Employee> loadedEmployees = EmployeeSerialization.loadEmployees(fileName);

        assertEquals(2, loadedEmployees.size());
        assertEquals("Alice", loadedEmployees.get(0).name);
        assertEquals("Bob", loadedEmployees.get(1).name);

        new File(fileName).delete();
    }

    @Test
    void testFileNotFound() {
        assertThrows(IOException.class, () -> EmployeeSerialization.loadEmployees("nonexistent.ser"));
    }

}