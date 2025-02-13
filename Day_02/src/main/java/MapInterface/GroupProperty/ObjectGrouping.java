package MapInterface.GroupProperty;
import java.util.*;
public class ObjectGrouping {
    public static Map<String, List<String>> groupByDepartment(List<Employee> employees) {
        Map<String, List<String>> grouped = new HashMap<>();
        for (Employee e : employees) {
            grouped.putIfAbsent(e.department, new ArrayList<>());
            grouped.get(e.department).add(e.name);
        }
        return grouped;
    }
}
