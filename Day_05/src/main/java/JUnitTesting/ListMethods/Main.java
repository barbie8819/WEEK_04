package JUnitTesting.ListMethods;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListManager manager = new ListManager();
        List<Integer> list = new ArrayList<>();

        manager.addElement(list, 5);
        manager.addElement(list, 10);
        System.out.println("List after additions: " + list);

        manager.removeElement(list, 5);
        System.out.println("List after removal: " + list);

        System.out.println("List size: " + manager.getSize(list));
    }
}
