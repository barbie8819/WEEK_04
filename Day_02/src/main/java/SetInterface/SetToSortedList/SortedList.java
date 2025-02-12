package SetInterface.SetToSortedList;

import java.util.*;

public class SortedList {
    public static List<Integer> sortSetToList(HashSet<Integer>set){
        List<Integer>result = new ArrayList<>();
        for (int i : set){
            result.add(i);
        }
        Collections.sort(result);
        return result;
    }
}
