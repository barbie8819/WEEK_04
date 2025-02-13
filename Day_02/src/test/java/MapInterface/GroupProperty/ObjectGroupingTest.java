package MapInterface.GroupProperty;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class ObjectGroupingTest {
    @Test
    void testGroupByDepartment() {
        List<Employee> employees = List.of(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );

        Map<String, List<String>> expected = new HashMap<>();
        expected.put("HR", List.of("Alice", "Carol"));
        expected.put("IT", List.of("Bob"));

        assertEquals(expected, ObjectGrouping.groupByDepartment(employees));
    }

}