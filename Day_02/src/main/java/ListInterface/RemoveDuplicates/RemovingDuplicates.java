package ListInterface.RemoveDuplicates;

import ListInterface.RotateList.RotateElements;

import java.util.ArrayList;
import java.util.*;

public class RemovingDuplicates {
    public static List<Integer> removeDuplicates(List<Integer>list){
        HashSet<Integer> set =new LinkedHashSet<>();
        for(int i : list){
            set.add(i);
        }
        List<Integer>result = new ArrayList<>();
        for (int i : set){
           result.add(i);
        }
        return  result;
    }
}
