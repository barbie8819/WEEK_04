package SetInterface.FindSubsets;

import java.util.HashSet;

public class SubsetFinder {
    public static boolean isSubset(HashSet<Integer>set1,HashSet<Integer>set2){
        return set2.containsAll(set1);
    }
}
