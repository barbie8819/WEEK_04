package SetInterface.SetToSortedList;

import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set1 =new HashSet<>();
        set1.add(5);
        set1.add(3);
        set1.add(9);
        set1.add(1);
        System.out.println("Set : " + set1);
        List<Integer> result = SortedList.sortSetToList(set1);
        System.out.println("Set to sorted list : "+ result);

    }
}
